package io.ljh.jcartstoreback.controller;

import io.ljh.jcartstoreback.dto.out.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(@RequestParam(required = false) String customer_name,
                                              @RequestParam(required = false) Byte status,
                                              @RequestParam(required = false) Double total_price,
                                              @RequestParam(required = false) Integer reword_points ,
                                              @RequestParam(required = false) Long create_time,
                                              @RequestParam(required = false, defaultValue = "1") Integer pageNum){

        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Integer order_id){
        return null;
    }

    @GetMapping("/getInvoice")
    public OrderInvoiceShowOutDTO getByCustomersId(@RequestParam Long orderId){
        return null;
    }

    @PostMapping("/create")
    public OrderShipShowOutDTO create(@RequestBody OrderListOutDTO orderListOutDTO){
        return null;
    }

    @PostMapping("/update")
    public OrderListOutDTO update(@RequestBody OrderListOutDTO orderListOutDTO){
        return null;
    }
}
