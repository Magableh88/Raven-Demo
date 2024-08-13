package com.example.Raven.Demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Raven.Demo.model.Order;
import com.example.Raven.Demo.repo.OrderRepo;

/**
 * A service class that acts as an intermediary between the Repo and the Controller class
 * 
 * Handles the saveOrder method by saving it to the database
 * @author Mohammad Makableh
 * @see Order
 * @see OrderRepo
 */
@Service
public class OrderService {
    
    @Autowired
    private OrderRepo orderRepository;

    /**
     * Saves the order using the orderRepo interface
     * @param Order takes in an order object
     * @return returns the state of the save method
     */
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}

