package com.example.test1228.dto.req;

import com.example.test1228.entity.Product;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductReq {
    private Long id;

    private String productName;

    private String thumb;

    private String status;

    private int price;

    private int amount;

    private String summary;

    private String content;

    private String indate;

    private String marketType;

    private Long orderNum;

    public Product toProduct() {
        return Product.builder()
                .id(id)
                .productname()
                .
    }
}
