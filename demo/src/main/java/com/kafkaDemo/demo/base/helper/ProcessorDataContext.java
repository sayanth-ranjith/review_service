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

    public BaseRequestModel getBaseRequestModel() {
        return baseRequestModel;
    }

    public void setBaseRequestModel(BaseRequestModel baseRequestModel) {
        this.baseRequestModel = baseRequestModel;
    }

    public BaseResponseModel getBaseResponseModel() {
        return baseResponseModel;
    }

    public void setBaseResponseModel(BaseResponseModel baseResponseModel) {
        this.baseResponseModel = baseResponseModel;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
