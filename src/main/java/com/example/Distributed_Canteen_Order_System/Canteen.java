package com.example.Distributed_Canteen_Order_System;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Canteen {
    @Id
    private Integer canteen_id; // Primary key

    private String location; // e.g., Main Block, North Block
    private String name;     // e.g., Central Canteen
}

