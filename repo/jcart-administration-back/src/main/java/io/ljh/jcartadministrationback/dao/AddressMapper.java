package io.ljh.jcartadministrationback.dao;

import io.ljh.jcartadministrationback.po.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
        int deleteByPrimaryKey(Integer addressId);

        int insert(Address record);

        int insertSelective(Address record);

        Address selectByPrimaryKey(Integer addressId);

        int updateByPrimaryKeySelective(Address record);

        int updateByPrimaryKey(Address record);

        List<Address> selectByCustomerId(@Param("customerId") Integer customerId);
}