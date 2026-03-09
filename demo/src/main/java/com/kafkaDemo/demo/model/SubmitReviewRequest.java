package com.kafkaDemo.demo.model;

import com.kafkaDemo.demo.base.models.BaseRequestModel;
import lombok.Builder;
import lombok.Data;

@Data
public class SubmitReviewRequest implements BaseRequestModel {
    private String productId;
    private String userId;
    private int rating;
    private String comment;
}
