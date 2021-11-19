package com.example.productservice.service;

import com.example.productservice.entity.Product;
import com.example.productservice.exception.ResourceNotFoundException;
import com.example.productservice.model.ProductModel;
import com.example.productservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public List<Product> findByName(String select){
        List<Product> products;
        if (select.isBlank()) {
            products = findAll();
        } else {
            products = repository.findByName(select);
        }
        return products;
    }

    public void addProduct(ProductModel productDTO){
        Product product = new Product(productDTO.getId(), productDTO.getName(), productDTO.getDescription(), productDTO.getImage(), productDTO.getQuantity(), productDTO.getPrice());
        repository.save(product);
    }

    public String getImageFilePath(MultipartFile file){
        String imageFilePath = "";
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        if (filename.contains("..")){
            System.out.println("not a valid file");
        }
        try{
            imageFilePath = Base64.getEncoder().encodeToString(file.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
        return imageFilePath;
    }

    public ProductModel findOneDTO(Integer id){
        Product item = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Товар", id));
        return ProductModel.from(item);
    }

    public Product findOne(Integer id){
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Товар", id));
    }

}
