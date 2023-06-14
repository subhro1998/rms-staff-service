package com.restaurant.staff.service.impl;

import com.restaurant.staff.service.IRestaurantStaffService;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Primary
public class StaffLoginService implements IRestaurantStaffService {
    @Override
    public ResponseEntity<String> registerStaff() {

        return new ResponseEntity<>("Login Successful", HttpStatus.ACCEPTED);
    }
}