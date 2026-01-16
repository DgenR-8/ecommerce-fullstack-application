package com.devdt.DT.Ecommerce.repository;

import com.devdt.DT.Ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
