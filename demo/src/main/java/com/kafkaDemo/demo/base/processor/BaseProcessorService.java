package com.kafkaDemo.demo.base.processor;

import com.kafkaDemo.demo.base.models.BaseRequestModel;

import java.util.Map;

public interface BaseProcessorService<T extends BaseRequestModel> {
    Object process(T request, Map<String, Object> context);
}
