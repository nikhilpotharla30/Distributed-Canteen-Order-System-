package com.example.Distributed_Canteen_Order_System;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepo;
    private final CanteenRepository canteenRepo;

    public OrderService(OrderRepository orderRepo, CanteenRepository canteenRepo) {
        this.orderRepo = orderRepo;
        this.canteenRepo = canteenRepo;
    }

    public Order placeOrder(Order order) {
        
        Canteen selected = canteenRepo.findAll().stream()
    .min(Comparator.comparingInt(c -> orderRepo.countByCanteen(c)))
    .orElseThrow(() -> new RuntimeException("No canteen available"));


        order.setCanteen(selected);
        return orderRepo.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}
