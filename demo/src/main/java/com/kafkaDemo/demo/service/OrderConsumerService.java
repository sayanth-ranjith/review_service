//package com.kafkaDemo.demo.service;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class OrderConsumerService {
//
//    @KafkaListener(topics = "order-status", groupId = "order-consumer-group")
//    public void consume(String status) {
//        System.out.println("Received Order Status: " + status);
//    }
//
//}
