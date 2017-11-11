package com.order.client.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.client.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, BigDecimal>{

}