package io.ljh.jcartstoreback.service;

import io.ljh.jcartstoreback.dto.in.OrderCheckoutInDTO;

public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO, Integer customerId);
}
