package com.example.project.uber.uberApp.services.impl;

import com.example.project.uber.uberApp.dto.DriverDto;
import com.example.project.uber.uberApp.dto.SignupDto;
import com.example.project.uber.uberApp.dto.UserDto;
import com.example.project.uber.uberApp.entities.User;
import com.example.project.uber.uberApp.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final ModelMapper modelMapper;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        User user = modelMapper.map(signupDto, User.class);
        user.setRoles
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
