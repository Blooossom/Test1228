package com.example.test1228.controller;


import com.example.test1228.dto.AdminReq;
import com.example.test1228.dto.AdminRes;
import com.example.test1228.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AdminController {

    @Autowired
    AdminService service;


    @PostMapping("/login")
    public AdminRes adminLogin(AdminReq req, HttpSession session) {

    }



}
