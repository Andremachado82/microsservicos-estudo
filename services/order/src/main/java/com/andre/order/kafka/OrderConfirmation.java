package com.andre.order.kafka;

import com.andre.order.customer.CustomerResponse;
import com.andre.order.enums.PaymentMethod;
import com.andre.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(

        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
