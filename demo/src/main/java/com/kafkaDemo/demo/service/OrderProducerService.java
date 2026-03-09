//package com.kafkaDemo.demo.service;
//
//import com.kafkaDemo.demo.model.SendOrderStatusRequest;
//import com.kafkaDemo.demo.service.kafka.KafkaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class OrderProducerService {
//
//    @Autowired
//    private KafkaService kafkaService;
//    public void sendEvent(SendOrderStatusRequest request) {
//        kafkaService.sendMessage(request.getOrderId(), request.getOrderStatus());
//    }
//}
