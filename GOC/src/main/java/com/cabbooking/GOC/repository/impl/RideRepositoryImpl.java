package com.cabbooking.GOC.repository.impl;

import com.cabbooking.GOC.model.Ride;
import com.cabbooking.GOC.repository.RideRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class RideRepositoryImpl implements RideRepository {

    private final List<Ride> rideList=new ArrayList<>();
    private final AtomicLong seq=new AtomicLong(1);
    @Override
    public Ride save(Ride ride) {
        if(ride.getRideId()==null)
        {
            ride.setRideId(seq.getAndIncrement());
        }
        rideList.add(ride);
        return ride;
    }
}
