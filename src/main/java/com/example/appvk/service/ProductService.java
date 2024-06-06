package com.example.appvk.service;

import com.example.appvk.model.Product;
import com.example.appvk.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service

public class ProductService {
    private final ProductRepository productRepository;


    public void createProduct(Product product){
        productRepository.save(product);
    }

    public Product getProduct(Long id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }


}
