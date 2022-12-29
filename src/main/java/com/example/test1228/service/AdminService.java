package com.example.test1228.service;


import com.example.test1228.dto.AdminReq;
import com.example.test1228.dto.AdminRes;
import com.example.test1228.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {


    @Autowired
    AdminRepository repo;

    public AdminRes adminLogin(AdminReq req){
         AdminRes res = new AdminRes(repo.findAdminByIdAndPassword(req.getAdminId(), req.getAdminPassword());
        return res;
    }


}
