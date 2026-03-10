package com.kafkaDemo.demo.service;

import com.kafkaDemo.demo.base.helper.ProcessorDataContext;
import com.kafkaDemo.demo.base.models.BaseRequestModel;
import com.kafkaDemo.demo.base.processor.BaseProcessorService;
import com.kafkaDemo.demo.entity.CustomerReviewDetailsEntity;
import com.kafkaDemo.demo.model.SubmitReviewRequest;
import com.kafkaDemo.demo.model.SubmitReviewResponse;
import com.kafkaDemo.demo.repo.CustomerReviewDetailsRepo;
import com.kafkaDemo.demo.type.ReviewServiceType;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component(value = ReviewServiceType.Constants.SUBMIT_REVIEW)
public class SubmitReviewService implements BaseProcessorService<BaseRequestModel> {

    @Autowired
    private CustomerReviewDetailsRepo customerReviewDetailsRepo;

    @Override
    public ProcessorDataContext process(BaseRequestModel request, Map<String, Object> context) {
        SubmitReviewRequest submitReviewRequest = (SubmitReviewRequest) request;
        log.info("Processing submit review request for user: {}", ((SubmitReviewRequest) request).getUserId());
        Integer id = saveToReviewDb(submitReviewRequest);
        SubmitReviewResponse response = new SubmitReviewResponse();
        response.setReviewId(id);
        response.setStatus("SUCCESS");
        ProcessorDataContext processorDataContext = new ProcessorDataContext();
        processorDataContext.setBaseResponseModel(response);
        return processorDataContext;
    }

    @Transactional
    private Integer saveToReviewDb(SubmitReviewRequest submitReviewRequest) {
        return customerReviewDetailsRepo
                .findByProductIdAndUserId(submitReviewRequest.getProductId(), submitReviewRequest.getUserId())
                .map(review -> {
                    review.setRating(submitReviewRequest.getRating());
                    review.setComments(submitReviewRequest.getComment());
                    CustomerReviewDetailsEntity savedEntity = customerReviewDetailsRepo.save(review);
                    return savedEntity.getId();
                })
                .orElseGet(() -> {
                    CustomerReviewDetailsEntity entity = new CustomerReviewDetailsEntity();
                    entity.setProductId(submitReviewRequest.getProductId());
                    entity.setUserId(submitReviewRequest.getUserId());
                    entity.setRating(submitReviewRequest.getRating());
                    entity.setComments(submitReviewRequest.getComment());
                    CustomerReviewDetailsEntity savedEntity = customerReviewDetailsRepo.save(entity);
                    return savedEntity.getId();
                });
    }
}