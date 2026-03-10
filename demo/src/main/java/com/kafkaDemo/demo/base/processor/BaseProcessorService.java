package com.kafkaDemo.demo.base.processor;

import com.kafkaDemo.demo.base.helper.ProcessorDataContext;
import com.kafkaDemo.demo.base.models.BaseRequestModel;

import java.util.Map;

public interface BaseProcessorService<T extends BaseRequestModel> {
    ProcessorDataContext process(T request, Map<String, Object> context);
}
