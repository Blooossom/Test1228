package com.example.test1228.entity;


import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @Column(name = "id", nullable = false, length = 12)
    private String id;

    @Column(name = "password", nullable = false, length = 12)
    private String password;
}
