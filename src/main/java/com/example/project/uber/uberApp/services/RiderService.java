package com.example.project.uber.uberApp.services;

import com.example.project.uber.uberApp.dto.DriverDto;
import com.example.project.uber.uberApp.dto.RideDto;
import com.example.project.uber.uberApp.dto.RideRequestDto;
import com.example.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    RiderDto rateDriver(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}
