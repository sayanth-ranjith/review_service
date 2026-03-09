package com.kafkaDemo.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubmitReviewResponse {
    private String reviewId;
    private String status;
}
