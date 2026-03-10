package com.kafkaDemo.demo.base.helper;

import com.kafkaDemo.demo.base.models.BaseRequestModel;
import com.kafkaDemo.demo.base.models.BaseResponseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessorDataContext {
    private BaseRequestModel baseRequestModel;
    private BaseResponseModel baseResponseModel;
    private String errorMessage;
    private String errorCode;
}
