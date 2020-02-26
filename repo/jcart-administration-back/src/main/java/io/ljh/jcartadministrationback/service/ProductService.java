package io.ljh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.ljh.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.ljh.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.ljh.jcartadministrationback.dto.out.ProductListOutDTO;
import io.ljh.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

}
