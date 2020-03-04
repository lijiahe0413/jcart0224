package io.ljh.jcartstoreback.service;

import io.ljh.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.ljh.jcartstoreback.po.Customer;

public interface CustomerService {
    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);

    Customer getByEmail(String email);
}
