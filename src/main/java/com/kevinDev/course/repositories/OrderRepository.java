package com.kevinDev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinDev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
