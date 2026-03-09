package com.kafkaDemo.demo.model;


import lombok.Data;
import lombok.Getter;

@Data
public class SendOrderStatusRequest {
    private String orderId;
    private String orderStatus;
}
