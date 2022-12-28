package com.example.test1228.dto;


import com.example.test1228.entity.Example;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExampleReqDTO {

    //바깥에서 들어오는 요청 DTO
    //Entity와 필드명이 똑같으면 오히려 좋지 않음
    private Long id;
    private String name;
    private int price;

    //Entity로 변환하는 메소드
    public Example toEntity(){
        // return new Example(id, name, price); 뭐가 어떻게 들어가는 지 모르는 상황이 나올 수 있고, 가독성이 망함
        return Example.builder()
                .id(id)
                .name(name)
                .price(price)
                .build();
                //어디가 어떻게 들어가는 지 좀 더 명확하게 볼 수 있음
                //생성자를 통해서 만드는 것보다 좀 더 좋음
                //점층적 생성자
    }
}
