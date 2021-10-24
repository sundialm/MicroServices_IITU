package com.example.productservice.controller;

import com.example.productservice.entity.Product;
import com.example.productservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveFeedback(@RequestBody Product product) {
        log.info("Inside saveFeedback method of FeedbackController");
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product findFeedbackById(@PathVariable("id") Long feedbackId) {
        log.info("Inside findFeedbackById method of FeedbackController");
        return productService.findProductById(feedbackId);
    }


}
