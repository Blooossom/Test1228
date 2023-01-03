package com.example.test1228.service.impl;


import com.example.test1228.dto.req.AdminReq;
import com.example.test1228.dto.res.AdminRes;
import com.example.test1228.entity.Admin;
import com.example.test1228.repository.AdminRepository;
import com.example.test1228.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {


    private final AdminRepository repo;


    @Override
    public String login(AdminReq req) {
        System.out.println(req.toString());
        return repo.findByIdAndPassword(req.getId(), req.getPassword()) == null? "failed":"success";
    }
}
