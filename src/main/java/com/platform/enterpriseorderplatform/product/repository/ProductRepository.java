package com.platform.enterpriseorderplatform.product.repository;

import com.platform.enterpriseorderplatform.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
