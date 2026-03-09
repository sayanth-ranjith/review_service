//package com.kafkaDemo.demo.service.kafka;
//
//import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Slf4j
//@Service
//@RequiredArgsConstructor
//public class KafkaService implements KafkaOrderProducerBase{
//
//    private final KafkaTemplate<String, String> kafkaTemplate;
//
//    public void sendMessage(String orderId, String orderStatus) {
//        if (orderId == null || orderStatus == null) {
//            throw new RuntimeException("Order ID and Order Status cannot be null");
//        }
//        kafkaTemplate.send("order-status", orderId, orderStatus);
//        log.info("Sent message to Kafka: Order ID = {}, Order Status = {}", orderId, orderStatus);
//    }
//
//}
