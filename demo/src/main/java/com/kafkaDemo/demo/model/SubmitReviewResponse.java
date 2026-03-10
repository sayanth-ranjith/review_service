package com.kafkaDemo.demo.model;

import com.kafkaDemo.demo.base.models.BaseResponseModel;
import lombok.Builder;
import lombok.Data;

@Data
public class SubmitReviewResponse implements BaseResponseModel {
    private Integer reviewId;
    private String status;
}
