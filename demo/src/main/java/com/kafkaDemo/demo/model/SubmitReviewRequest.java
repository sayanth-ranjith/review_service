package com.kafkaDemo.demo.model;

import com.kafkaDemo.demo.base.models.BaseRequestModel;
import lombok.Builder;
import lombok.Data;

@Data
public class SubmitReviewRequest implements BaseRequestModel {
    private int productId;
    private int userId;
    private int rating;
    private String comment;
}
