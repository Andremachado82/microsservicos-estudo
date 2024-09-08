package com.andre.payment.dto;

import com.andre.payment.enums.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(

        Integer id,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        Customer customer
) {
}
