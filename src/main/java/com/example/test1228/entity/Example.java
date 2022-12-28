package com.example.test1228.entity;


import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Example")
public class Example {

    @Id //PK 표시
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column// Column명이 다르다면 위 Table 처럼 (name=)
    private Long id; //보통은 Long으로 적음
    @Column(name = "name", nullable = true, length = 20)
    private String name;
    @Column(name = "price", nullable = true, length = 20)
    private int price;
}
