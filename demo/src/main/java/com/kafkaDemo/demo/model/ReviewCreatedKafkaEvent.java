package com.kafkaDemo.demo.model;

import com.kafkaDemo.demo.base.models.kafka.BaseKafkaProducerModel;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewCreatedKafkaEvent implements BaseKafkaProducerModel {
    private Integer reviewId;
    private Integer productId;
    private String reviewText;


    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
}
