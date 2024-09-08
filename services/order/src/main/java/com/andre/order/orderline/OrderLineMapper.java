package com.andre.order.orderline;

import com.andre.order.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderLineMapper {

    public Orderline toOrderLine(OrderLineRequest request) {
        return Orderline.builder()
                .id(request.orderId())
                .productId(request.productId())
                .order(
                        Order.builder()
                                .id(request.orderId())
                                .build()
                )
                .quantity(request.quantity())
                .build();
    }

    public OrderLineResponse toOrderLineResponse(Orderline orderLine) {
        return new OrderLineResponse(
                orderLine.getId(),
                orderLine.getQuantity()
        );
    }
}
