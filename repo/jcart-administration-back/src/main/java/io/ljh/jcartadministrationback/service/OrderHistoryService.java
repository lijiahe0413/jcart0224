package io.ljh.jcartadministrationback.service;

import io.ljh.jcartadministrationback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {
    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);
}
