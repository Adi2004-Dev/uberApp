package com.example.project.uber.uberApp.configs;

import com.example.project.uber.uberApp.dto.PointDto;
import com.example.project.uber.uberApp.utils.GeometryUtil;
import org.locationtech.jts.geom.GeometryFactory;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        ModelMapper mapper = new ModelMapper();

        mapper.typeMap(PointDto.class, org.locationtech.jts.geom.Point.class).setConverter(context -> {
            PointDto pointDto = context.getSource();
            return GeometryUtil.createPoint(pointDto);
        });

        mapper.typeMap(Point.class, PointDto.class).setConverter(context -> {
            Point point = context.getSource();
            double coordinates[] = {
                    point.getX(),
                    point.getY()
            };
            return new PointDto(coordinates);
        });

        return mapper;
    }

}
