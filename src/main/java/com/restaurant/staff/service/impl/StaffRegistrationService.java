package com.restaurant.staff.service.impl;

import com.restaurant.staff.service.IRestaurantStaffService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StaffRegistrationService implements IRestaurantStaffService {
    @Override
    public ResponseEntity<String> registerStaff() {

        return new ResponseEntity<>("Registration Successful", HttpStatus.CREATED);
    }
}