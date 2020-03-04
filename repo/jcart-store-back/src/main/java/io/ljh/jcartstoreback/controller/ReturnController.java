package io.ljh.jcartstoreback.controller;

import io.ljh.jcartstoreback.dto.in.ReturnApplyInDTO;
import io.ljh.jcartstoreback.dto.out.PageOutDTO;
import io.ljh.jcartstoreback.dto.out.ReturnListOutDTO;
import io.ljh.jcartstoreback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
@CrossOrigin
public class ReturnController {

    @PostMapping("/apply")
    public Integer apply(
            @RequestBody ReturnApplyInDTO returnApplyInDTO,
            @RequestAttribute Integer customerId
    ){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<ReturnListOutDTO> getList(
            @RequestAttribute Integer customerId,
            @RequestParam Integer pageNum
    ){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(
            @RequestParam Integer returnId
    ){
        return null;
    }

}
