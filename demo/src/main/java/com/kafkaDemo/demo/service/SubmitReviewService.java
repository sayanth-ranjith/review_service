package com.kafkaDemo.demo.service;

import com.kafkaDemo.demo.base.models.BaseRequestModel;
import com.kafkaDemo.demo.base.processor.BaseProcessorService;
import com.kafkaDemo.demo.type.ReviewServiceType;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component(value = ReviewServiceType.Constants.SUBMIT_REVIEW)
public class SubmitReviewService implements BaseProcessorService<BaseRequestModel> {
    @Override
    public Object process(BaseRequestModel request, Map<String, Object> context) {
        System.out.println("IT WORKED!");
        return null;
    }
}
