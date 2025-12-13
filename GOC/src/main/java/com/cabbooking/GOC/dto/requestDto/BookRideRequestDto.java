package com.cabbooking.GOC.dto.requestDto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BookRideRequestDto {
    private Long userId;
    private  Long driverId;
    private  String pickupLocation;
    private  String dropOffLocation;
    private BigDecimal fare;
}
