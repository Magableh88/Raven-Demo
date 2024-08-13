package com.example.Raven.Demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Raven.Demo.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
}

