package io.ljh.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import io.ljh.jcartadministrationback.po.Administrator;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer administratorId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer administratorId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);

    Administrator getByUsername(String username);

    Page<Administrator> getList();

    void batchDelete(List<Integer> administratorIds);
}