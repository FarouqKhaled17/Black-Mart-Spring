package com.bm.blackMart.service.product;

import com.bm.blackMart.model.Product;
import com.bm.blackMart.repository.ProductRepository;

import java.util.List;

public interface IProductService  {
    Product addProduct(Product product);
    Product getProductById(Long id);
    void updateProduct(Product product ,Long ProductId);
    void deleteProduct(Long id);
    List<Product> getAllProducts();
    List <Product> getProductsByCategory(String category);
    List <Product> getProductsByBrand(String brand);
    List <Product> getProductsByCategoryAndBrand(String category, String brand);
    List <Product> getProductsByName(String name);
    List <Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand , String name);
}
