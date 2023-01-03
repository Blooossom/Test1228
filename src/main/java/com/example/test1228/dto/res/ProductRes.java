package com.example.test1228.dto.res;

import com.example.test1228.entity.Product;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductRes {

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

    public ProductRes(Product product) {
        this.id = product.getId();
        this.productName = product.getProductname();
        this.thumb = product.getThumb();
        this.status = product.getStatus();
        this.price = product.getPrice();
        this.amount = product.getAmount();
        this.summary = product.getSummary();
        this.content = product.getContent();
        this.indate = product.getIndate();
        this.marketType = product.getMarkettype();
        this.orderNum = product.getOrdernum();
    }


}
