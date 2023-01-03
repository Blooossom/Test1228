package com.example.test1228.dto.req;


import com.example.test1228.entity.Admin;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AdminReq {

    private String id;

    private String password;

    public Admin toAdmin() {
        return Admin.builder()
                .id(this.id)
                .password(this.password)
                .build();
    }
}
