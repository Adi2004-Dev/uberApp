package com.example.project.uber.uberApp.services;

import com.example.project.uber.uberApp.dto.DriverDto;
import com.example.project.uber.uberApp.dto.RideDto;
import com.example.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto rateRider(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}
