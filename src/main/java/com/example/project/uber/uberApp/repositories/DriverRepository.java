package com.example.project.uber.uberApp.repositories;

import com.example.project.uber.uberApp.entities.Driver;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// ST_DISTANCE(point1, point2)
// ST_DWithin(point1, 10000)

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    @Query("SELECT d.*, ST_distance(d.current_location, :pickupLocation) AS distance " +
            "FROM drivers AS d " +
            " where available = true AND ST_DWithin(d.current_location, :pickupLocation, 10000) " +
            "ORDER by distance " +
            "LIMIT 10"
    )
    List<Driver> findTenNearestDrivers(Point pickupLocation);
}
