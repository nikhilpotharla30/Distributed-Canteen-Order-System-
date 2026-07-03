package com.example.Distributed_Canteen_Order_System;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "orders")  // Because "order" is a reserved SQL word
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id;

    @ManyToOne
    @JoinColumn(name = "canteen_id", referencedColumnName = "canteen_id")
    private Canteen canteen;

    private String order_details;

    // Added field for order date
    private LocalDateTime orderDate;

    // Added field for order status
    private String status;
}