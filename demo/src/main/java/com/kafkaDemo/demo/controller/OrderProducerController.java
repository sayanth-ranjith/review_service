//package com.kafkaDemo.demo.controller;
//
//import com.kafkaDemo.demo.model.SendOrderStatusRequest;
//import com.kafkaDemo.demo.service.OrderProducerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class OrderProducerController {
//
//    @Autowired
//    private OrderProducerService orderProducerService;
//    @PostMapping("/sendOrderStatus")
//    public ResponseEntity<?> sendOrderStatus(@RequestBody SendOrderStatusRequest request) {
//        orderProducerService.sendEvent(request);
//        return ResponseEntity.ok("Order status sent successfully");
//    }
//}
