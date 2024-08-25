package com.example.project.uber.uberApp.dto;

import com.example.project.uber.uberApp.entities.Driver;
import com.example.project.uber.uberApp.entities.Rider;
import com.example.project.uber.uberApp.entities.enums.PaymentMethod;
import com.example.project.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;


    private LocalDateTime createdTime;
    private RiderDto riderDto;
    private DriverDto driverDto;
    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private String otp;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
