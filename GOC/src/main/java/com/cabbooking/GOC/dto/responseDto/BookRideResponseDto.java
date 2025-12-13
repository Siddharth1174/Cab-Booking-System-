package com.cabbooking.GOC.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class BookRideResponseDto {
    private Long rideId;
    private Long userId;
    private  Long driverId;
    private  String pickupLocation;
    private  String dropOffLocation;
    private BigDecimal fare;
    private  String status;
}
