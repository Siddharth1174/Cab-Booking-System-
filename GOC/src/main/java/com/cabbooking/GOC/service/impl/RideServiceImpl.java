package com.cabbooking.GOC.service.impl;

import com.cabbooking.GOC.dto.requestDto.BookRideRequestDto;
import com.cabbooking.GOC.dto.responseDto.BookRideResponseDto;
import com.cabbooking.GOC.model.Ride;
import com.cabbooking.GOC.repository.RideRepository;
import com.cabbooking.GOC.service.RideService;
import com.cabbooking.GOC.util.RideMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RideServiceImpl implements RideService {

    private final RideRepository rideRepository;

    @Override
    public BookRideResponseDto bookCab(BookRideRequestDto request) {
        Ride ride= RideMapper.toEntity(request);
        Ride saved=rideRepository.save(ride);
        return RideMapper.toResponse(saved);
    }
}
