package com.example.Raven.Demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Raven.Demo.model.Order;
import com.example.Raven.Demo.service.OrderService;

/**
 * This controller class handles the request to submit an order and display a success message
 * @author Mohammad Makableh
 * @see OrderService
 * @see Order
 */
@Controller
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    /**
     * Handles the http request to submit an order and display a success message
     * 
     * @param order takes in an order and returns the order information
     * @param model
     * @return returns the html page displaying success message
     */
    @PostMapping("/submitOrder")
    public String submitOrder(@ModelAttribute Order order, Model model) {
        Order savedOrder = orderService.saveOrder(order);
        model.addAttribute("order", savedOrder);
        return "order_success"; // This returns the "order_success.html" page
    }

}
