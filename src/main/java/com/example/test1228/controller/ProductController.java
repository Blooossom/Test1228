package com.example.test1228.controller;


import com.example.test1228.dto.req.ProductReq;
import com.example.test1228.dto.res.ProductRes;
import com.example.test1228.service.PictureService;
import com.example.test1228.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;
    private final PictureService pictureService;

    @GetMapping("/products")
    public List<ProductRes> selectProductList(){
        return service.selectProductList();
    }

    @PostMapping("/products")
    public String addProduct(ProductReq req){
        return service.addProduct(req);
    }

    @PutMapping("/products")
    public String updateProducts(ProductReq req){
        return service.updateProduct(req);
    }
    @DeleteMapping("/products")
    public String deleteProducts(ProductReq req){
        return service.deleteProducts(req);
    }
    @GetMapping("/products/{id}")
    public ProductRes selectProduct(@PathVariable String id){
        return service.selectProduct(id);
    }

}
