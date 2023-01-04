package com.example.test1228.repository;

import com.example.test1228.dto.res.ProductRes;
import com.example.test1228.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    ProductRes findByProductname(String id);
}
