package com.kafkaDemo.demo.type;

import com.kafkaDemo.demo.base.type.GeneralReferenceType;

import java.util.Optional;

public enum ReviewServiceType implements GeneralReferenceType {
    SUBMIT_REVIEW(Constants.SUBMIT_REVIEW),
    GET_REVIEW("getReview");

    public static final class Constants {
        public static final String SUBMIT_REVIEW = "submitReview";
    }

    private final String type;

    ReviewServiceType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public Optional<?> findByType(String type) {
        for (ReviewServiceType reviewServiceType : values()) {
            if (reviewServiceType.getType().equals(type)) {
                return Optional.of(reviewServiceType);
            }
        }
        return Optional.empty();
    }
}
