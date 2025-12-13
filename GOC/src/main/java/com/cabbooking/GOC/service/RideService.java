package com.cabbooking.GOC.service;

import com.cabbooking.GOC.dto.requestDto.BookRideRequestDto;
import com.cabbooking.GOC.dto.responseDto.BookRideResponseDto;

public interface RideService {
    public BookRideResponseDto bookCab(BookRideRequestDto request);
}
