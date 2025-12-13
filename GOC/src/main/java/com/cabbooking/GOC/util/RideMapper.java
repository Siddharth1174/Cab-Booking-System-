package com.cabbooking.GOC.util;

import com.cabbooking.GOC.dto.requestDto.BookRideRequestDto;
import com.cabbooking.GOC.dto.responseDto.BookRideResponseDto;
import com.cabbooking.GOC.enums.RideStatus;
import com.cabbooking.GOC.model.Ride;

import java.math.BigDecimal;


public class RideMapper {
    private RideMapper(){}

    public static Ride toEntity(BookRideRequestDto req) {
        Ride ride = new Ride();
        ride.setUserId(req.getUserId());
        ride.setDriverId(req.getDriverId());
        ride.setPickupLocation(req.getPickupLocation());
        ride.setDropOffLocation(req.getDropOffLocation());
        ride.setFare(req.getFare() != null ? req.getFare() : BigDecimal.ZERO);
        ride.setStatus(String.valueOf(RideStatus.IN_PROGRESS)); // your business rule
        return ride;
    }

    public static BookRideResponseDto toResponse(Ride saved) {
        return new BookRideResponseDto(
                saved.getRideId(),
                saved.getUserId(),
                saved.getDriverId(),
                saved.getPickupLocation(),
                saved.getDropOffLocation(),
                saved.getFare(),
                saved.getStatus()
        );
    }

}

