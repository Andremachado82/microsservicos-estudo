package com.andre.order.payment;

import com.andre.order.customer.CustomerResponse;
import com.andre.order.enums.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(

        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
