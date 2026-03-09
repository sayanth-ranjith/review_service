package com.kafkaDemo.demo.base.type;

import java.util.Optional;

public interface GeneralReferenceType {
    String getType();

    Optional<?> findByType(String type);
}
