package com.ect.ecommercespringboot.dao;

import com.ect.ecommercespringboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
