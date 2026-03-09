package com.kafkaDemo.demo.base.delegators;

import com.kafkaDemo.demo.base.processor.BaseProcessorService;
import com.kafkaDemo.demo.base.models.BaseRequestModel;
import com.kafkaDemo.demo.base.type.GeneralReferenceType;
import org.springframework.stereotype.Service;

/***
 * ServiceDelegator is an interface that defines a method for delegating service processing based on a given type and request.
 * It allows for dynamic delegation of services without the need for hardcoding specific service implementations.
 * @author [Sayanth P V]
 */

@Service
public interface ServiceDelegator {
    <T extends BaseRequestModel> BaseProcessorService<T> delegateService(GeneralReferenceType type, T request);
}
