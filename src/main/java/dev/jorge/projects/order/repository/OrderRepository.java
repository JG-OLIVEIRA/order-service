package dev.jorge.projects.order.repository;


import dev.jorge.projects.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
