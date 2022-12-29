package com.example.test1228.dto;


import com.example.test1228.entity.Admin;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AdminReq {

    private String adminId;

    private String adminPassword;

    public Admin toAdmin() {
        return Admin.builder()
                .id(this.adminId)
                .password(this.adminPassword)
                .build();
    }
}
