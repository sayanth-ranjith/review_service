package com.kafkaDemo.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "customer_review_details")
@Data
public class CustomerReviewDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "review_seq_generator")
    @SequenceGenerator(
            name = "review_seq_generator",
            sequenceName = "SEQ_REVIEW_ID",
            allocationSize = 1
    )
    @Column(name = "id")
    private int id;
    @Column(name = "product_id")
    private int productId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "rating")
    private int rating;
    @Column(name = "comments")
    private String comments;


}
