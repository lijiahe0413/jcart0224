package io.ljh.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.ljh.jcartstoreback.dto.out.ProductListOutDTO;
import io.ljh.jcartstoreback.dto.out.ProductShowOutDTO;
import io.ljh.jcartstoreback.po.Product;

public interface ProductService {
    Page<ProductListOutDTO> search(Integer pageNum);

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);
}
