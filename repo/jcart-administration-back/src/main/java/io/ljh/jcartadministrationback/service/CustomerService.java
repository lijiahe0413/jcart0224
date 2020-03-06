package io.ljh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.ljh.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.ljh.jcartadministrationback.po.Customer;

public interface CustomerService {
    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);
}
