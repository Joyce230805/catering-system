package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.model.OrderItem;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {


        
        // 👉 存訂單（包含多個 items）
        Order savedOrder = orderRepository.save(order);

        // 👉 Email內容
        StringBuilder emailText = new StringBuilder();

        emailText.append("New Catering Order\n\n");
        emailText.append("Name: ").append(order.getCustomerName()).append("\n");
        emailText.append("Phone: ").append(order.getPhone()).append("\n");
        emailText.append("Pickup: ").append(order.getPickupTime()).append("\n\n");

        emailText.append("Order Details:\n\n");

        if (order.getItems() != null) {
            int count = 1;

            for (OrderItem item : order.getItems()) {
                emailText.append("Meal ").append(count).append(":\n");
                emailText.append("Main: ").append(item.getMain()).append("\n");
                emailText.append("Sides: ").append(item.getSides()).append("\n");
                emailText.append("Qty: ").append(item.getQuantity()).append("\n\n");
                count++;
            }
        }

        // 發送 Email
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("highpoint0914@gmail.com");
        message.setSubject("New Catering Order");
        message.setText(emailText.toString());

        try {
            mailSender.send(message);
        } catch (Exception e) {
            System.out.println("Email failed: " + e.getMessage());
        }

        return savedOrder;
    }
}