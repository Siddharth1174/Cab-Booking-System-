package com.cabbooking.GOC.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Payment {
    private int paymentId;
    private int bookingId;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;
    private Timestamp paymentTime;
}
