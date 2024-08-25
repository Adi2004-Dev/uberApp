package com.example.project.uber.uberApp.strategies.impl;

import com.example.project.uber.uberApp.dto.RideRequestDto;
import com.example.project.uber.uberApp.entities.RideRequest;
import com.example.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
