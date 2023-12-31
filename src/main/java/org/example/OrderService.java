package org.example;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order getOrder(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("org.example.Order not found"));
    }
}