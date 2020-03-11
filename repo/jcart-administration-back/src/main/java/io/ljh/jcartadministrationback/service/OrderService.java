package io.ljh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.ljh.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.ljh.jcartadministrationback.dto.out.OrderListOutDTO;
import io.ljh.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.ljh.jcartadministrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}