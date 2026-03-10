package com.kafkaDemo.demo.repo;

import com.kafkaDemo.demo.entity.CustomerReviewDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerReviewDetailsRepo extends JpaRepository<CustomerReviewDetailsEntity, Integer> {
    public CustomerReviewDetailsEntity findByUserId(Integer userId);
    public Optional<CustomerReviewDetailsEntity> findByProductIdAndUserId(Integer productId, Integer userId);
}
