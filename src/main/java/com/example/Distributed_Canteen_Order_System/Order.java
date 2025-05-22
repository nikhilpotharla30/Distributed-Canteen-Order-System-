package com.example.Distributed_Canteen_Order_System;

import jakarta.persistence.*;
import lombok.Data;

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
}
