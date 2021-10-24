package com.example.brandservice.service;

import com.example.brandservice.VO.Product;
import com.example.brandservice.VO.ResponseTemplateVO;
import com.example.brandservice.entity.Brand;
import com.example.brandservice.repository.BrandRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class BrandService {

    private BrandRepository brandRepository;

    private RestTemplate restTemplate;

    public Product getFeedbackById(Long brandId){
        return restTemplate.getForObject("http://product-service/products"+ brandId, Product.class);
    }

    public Brand saveBrand(Brand brand) {
        log.info("Inside saveUser of method UserService");
        return brandRepository.save(brand);
    }

    public ResponseTemplateVO getBrandWithProduct(Long brandId) {
        log.info("Inside getUserWithFeedback of method UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Brand brand = brandRepository.findBrandById(brandId);

        Product product = restTemplate.getForObject("http://localhost:8017/products/" + brand.getName(), Product.class);

        vo.setProduct(product);
        vo.setBrand(brand);
        return vo;
    }


}
