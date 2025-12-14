package com.cabbooking.GOC.dto;

import lombok.Data;

@Data
public class PaymentRequestDTO {
    private int bookingId;
    private double amount;
    private String paymentMethod;
}