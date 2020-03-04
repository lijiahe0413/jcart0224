package io.ljh.jcartstoreback.controller;

import com.github.pagehelper.Page;
import io.ljh.jcartstoreback.dto.in.ProductSearchInDTO;
import io.ljh.jcartstoreback.dto.out.PageOutDTO;
import io.ljh.jcartstoreback.dto.out.ProductListOutDTO;
import io.ljh.jcartstoreback.dto.out.ProductShowOutDTO;
import io.ljh.jcartstoreback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(
            ProductSearchInDTO productSearchInDTO,
            @RequestParam(required = false,defaultValue = "1") Integer pageNum
    ){
        Page<ProductListOutDTO> page = productService.search(pageNum);
        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(
            @RequestParam Integer productId
    ){
        ProductShowOutDTO productShowOutDTO = productService.getShowById(productId);
        return productShowOutDTO;
    }

}
