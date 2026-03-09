package com.kafkaDemo.demo.controller;

import com.kafkaDemo.demo.model.SubmitReviewRequest;
import com.kafkaDemo.demo.base.processor.BaseProcessorService;
import com.kafkaDemo.demo.base.delegators.ServiceDelegator;
import com.kafkaDemo.demo.type.ReviewServiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SubmitReviewController {

    @Autowired
    private ServiceDelegator serviceDelegator;

    @PostMapping("/submitReview")
    public ResponseEntity<?> submitReview(@RequestBody SubmitReviewRequest request) {
        BaseProcessorService<SubmitReviewRequest> processor = serviceDelegator.delegateService(ReviewServiceType.SUBMIT_REVIEW, request);
        Map<String, Object> context = new HashMap<>();
        processor.process(request, context)  ;
        return null;
    }
}
