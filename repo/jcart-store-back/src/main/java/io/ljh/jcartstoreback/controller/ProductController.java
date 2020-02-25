package io.ljh.jcartstoreback.controller;

import io.ljh.jcartstoreback.dto.in.ProductCreateInDTO;
import io.ljh.jcartstoreback.dto.in.ProductUpdateInDTO;
import io.ljh.jcartstoreback.dto.out.PageOutDTO;
import io.ljh.jcartstoreback.dto.out.ProductListOutDTO;
import io.ljh.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(@RequestParam(required = false) String productCode,
                                                @RequestParam(required = false) String productName,
                                                @RequestParam(required = false) Byte status,
                                                @RequestParam(required = false,defaultValue = "1") Integer PageNum){
        return null;
    }


    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

}
