package com.example.appvk.service;

import com.example.appvk.model.Order;
import com.example.appvk.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public void createOrder(Order order){
        orderRepository.save(order);
    }

    public Order getOrder(Long id){
        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }


    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }



}
