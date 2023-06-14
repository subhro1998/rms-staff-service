package com.restaurant.staff.controller;

import com.restaurant.staff.service.IRestaurantStaffService;
import com.restaurant.staff.service.impl.StaffRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class RestaurantStaffController {

    @Autowired
    IRestaurantStaffService service;

    @PostMapping("/login")
    public void registerAttendance( ) {
        service.registerStaff();
    }

    @PostMapping("/register")
    public void registerNewStaff( ) {
        service = new StaffRegistrationService();

    }
}