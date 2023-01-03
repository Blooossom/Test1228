package com.example.test1228.service;

import com.example.test1228.dto.req.ProductReq;
import com.example.test1228.dto.res.ProductRes;
import com.example.test1228.entity.Product;

import java.util.List;

public interface ProductService {

    List<ProductRes> selectProductList();

    String addProduct(ProductReq req);

    String deleteProducts(ProductReq req);

    ProductRes selectProduct(String id);

    String updateProduct(ProductReq req);

}
