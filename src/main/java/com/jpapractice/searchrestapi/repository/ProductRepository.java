package com.jpapractice.searchrestapi.repository;

import com.jpapractice.searchrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query,'%')" +
            "Or p.description LIKE CONCAT('%',:query,'%')")
    List<Product> searchProducts(String query);

    @Query(value = "select * from products p where " +
            "p.name like concat('%',:query,'%')" +
            "Or p.description like concat('%',:query,'%')", nativeQuery = true)
    List<Product> searchProductsSQL(String query);
}
