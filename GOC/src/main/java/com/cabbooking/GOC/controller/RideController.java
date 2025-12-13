package com.cabbooking.GOC.controller;

import com.cabbooking.GOC.dto.requestDto.BookRideRequestDto;
import com.cabbooking.GOC.dto.responseDto.BookRideResponseDto;
import com.cabbooking.GOC.service.RideService;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/rides")
public class RideController {


    private final RideService rideService;

    @PostMapping("/book")
    public ResponseEntity<@NotNull BookRideResponseDto> bookCab(@RequestBody BookRideRequestDto request)
    {
        BookRideResponseDto rideResponse=rideService.bookCab(request);
       return ResponseEntity.status(HttpStatus.OK).body(rideResponse);
    }


}
