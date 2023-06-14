package com.restaurant.staff.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface IRestaurantStaffService {

    public ResponseEntity<String> registerStaff();
}