package com.example.test1228.service.impl;

import com.example.test1228.dto.req.ProductReq;
import com.example.test1228.dto.res.ProductRes;
import com.example.test1228.entity.Product;
import com.example.test1228.repository.ProductRepository;
import com.example.test1228.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repo;
    @Override
    public List<ProductRes> selectProductList() {
        return repo.findAll()
                .stream()
                .map(product -> new ProductRes(product))
                .collect(Collectors.toList());
    }

    @Override
    public String addProduct(ProductReq req) {
        try {
            repo.save(req.builder)
        } catch (Exception err) {
            err.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String deleteProducts(ProductReq req) {
        return null;
    }

    @Override
    public ProductRes selectProduct(String id) {
        return null;
    }

    @Override
    public String updateProduct(ProductReq req) {
        return null;
    }
}
