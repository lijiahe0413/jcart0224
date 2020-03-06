package io.ljh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.ljh.jcartadministrationback.dto.out.OrderListOutDTO;
import io.ljh.jcartadministrationback.dto.out.OrderShowOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

}
