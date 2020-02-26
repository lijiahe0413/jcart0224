package io.ljh.jcartstoreback.service;

import io.ljh.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {
    ProductShowOutDTO getById(Integer productId);
}
