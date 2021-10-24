package com.example.brandservice.controller;

import com.example.brandservice.VO.ResponseTemplateVO;
import com.example.brandservice.entity.Brand;
import com.example.brandservice.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class BrandController {

    private BrandService brandService;

    @PostMapping("/")
    public Brand saveBrand(@RequestBody Brand brand) {
        log.info("Inside saveUser method of UserController");
        return brandService.saveBrand(brand);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getBrandWithProduct(@PathVariable("id") Long brandId) {
        log.info("Inside saveUser method of UserController");
        return brandService.getBrandWithProduct(brandId);
    }

}

