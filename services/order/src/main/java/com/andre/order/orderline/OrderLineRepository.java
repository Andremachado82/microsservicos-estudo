package com.andre.order.orderline;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderLineRepository extends JpaRepository<Orderline, Integer> {

    List<Orderline> findAllByOrderId(Integer orderId);
}
