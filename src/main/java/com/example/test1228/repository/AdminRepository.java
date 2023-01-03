package com.example.test1228.repository;


import com.example.test1228.dto.res.AdminRes;
import com.example.test1228.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

    Optional<AdminRes> findByIdAndPassword(String id, String password);



}
