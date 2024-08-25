package com.example.project.uber.uberApp.dto;

import com.example.project.uber.uberApp.entities.Rider;
import com.example.project.uber.uberApp.entities.enums.PaymentMethod;
import com.example.project.uber.uberApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {

    private Long id;

    private PointDto pickupLocation;

    private PointDto dropOffLocation;
    private PaymentMethod paymentMethod;

    private LocalDateTime requestedTime;

    private Rider rider;



    private RideRequestStatus rideRequestStatus;
}
