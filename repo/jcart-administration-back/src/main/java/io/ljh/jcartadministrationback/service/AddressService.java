package io.ljh.jcartadministrationback.service;

import io.ljh.jcartadministrationback.po.Address;

import java.util.List;

public interface AddressService {
    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);
}
