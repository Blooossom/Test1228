package com.example.test1228.controller;


import com.example.test1228.dto.req.AdminReq;
import com.example.test1228.dto.res.AdminRes;
import com.example.test1228.service.impl.AdminServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
public class AdminController {

    private final AdminServiceImpl service;


    @PostMapping("/login")
    public String adminLogin(AdminReq req, HttpSession session) {
        return service.login(req);
    }



}
