package com.kafkaDemo.demo.service.kafka;

import com.kafkaDemo.demo.base.models.kafka.BaseKafkaProducerModel;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ReviewEventProducer {
    private final KafkaTemplate<String, BaseKafkaProducerModel> kafkaTemplate;

    public ReviewEventProducer(KafkaTemplate<String, BaseKafkaProducerModel> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendReviewCreatedEvent(BaseKafkaProducerModel event) throws IllegalArgumentException {
        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null");
        }
        kafkaTemplate.send("review-created-topic", event);
    }
}
