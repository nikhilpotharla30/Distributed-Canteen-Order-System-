package com.example.Distributed_Canteen_Order_System;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    int countByCanteen(Canteen c);
}
