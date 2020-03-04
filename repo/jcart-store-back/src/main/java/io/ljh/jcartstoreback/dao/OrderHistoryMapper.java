package io.ljh.jcartstoreback.dao;

import io.ljh.jcartstoreback.po.OrderHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHistoryMapper {
    int deleteByPrimaryKey(Long orderHistoryId);

    int insert(OrderHistory record);

    int insertSelective(OrderHistory record);

    OrderHistory selectByPrimaryKey(Long orderHistoryId);

    int updateByPrimaryKeySelective(OrderHistory record);

    int updateByPrimaryKey(OrderHistory record);
}