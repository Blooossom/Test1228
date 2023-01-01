package com.example.test1228.service;


import com.example.test1228.dto.AdminReq;
import com.example.test1228.dto.AdminRes;
import com.example.test1228.entity.Admin;
import com.example.test1228.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AdminService {


    @Autowired
    AdminRepository repo;

    public AdminRes adminLogin(AdminReq req){
        Admin admin = repo.findById(req.getAdminId()).orElse(null);
        return new AdminRes(admin.getId(), admin.getPassword());
    }


}
