package com.example.test1228.repository;


import com.example.test1228.dto.AdminReq;
import com.example.test1228.dto.AdminRes;
import com.example.test1228.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

    public Admin findAdminByIdAndPassword(String id, String password);


}
