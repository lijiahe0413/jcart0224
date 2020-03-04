package io.ljh.jcartstoreback.service;

import io.ljh.jcartstoreback.po.Address;

import java.util.List;

public interface AddressService {
    List<Address> getByCustomerId(Integer customerId);

    void create(Address address);

    Address getById(Integer shipAddressId);
}
