package io.ljh.jcartstoreback.service.impl;

import io.ljh.jcartstoreback.dao.AddressMapper;
import io.ljh.jcartstoreback.po.Address;
import io.ljh.jcartstoreback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> getByCustomerId(Integer customerId) {
        return addressMapper.selectByCustomerId(customerId);
    }

    @Override
    public void create(Address address) {
        addressMapper.insertSelective(address);
    }

    @Override
    public Address getById(Integer shipAddressId) {
        Address address = addressMapper.selectByPrimaryKey(shipAddressId);
        return address;
    }
}
