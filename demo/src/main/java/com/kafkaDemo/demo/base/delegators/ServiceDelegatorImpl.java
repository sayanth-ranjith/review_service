package com.kafkaDemo.demo.base.delegators;

import com.kafkaDemo.demo.base.processor.BaseProcessorService;
import com.kafkaDemo.demo.base.models.BaseRequestModel;
import com.kafkaDemo.demo.base.type.GeneralReferenceType;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ServiceDelegatorImpl implements ServiceDelegator {
    private final ApplicationContext applicationContext;

    public ServiceDelegatorImpl(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends BaseRequestModel> BaseProcessorService<T> delegateService(GeneralReferenceType type, T request) {
        BaseProcessorService<T> bean = (BaseProcessorService<T>) applicationContext.getBean(type.getType());
        if (bean != null) {
            return bean;
        }
        return null;
    }
}
