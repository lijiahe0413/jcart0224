package io.ljh.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.ljh.jcartstoreback.po.Return;

public interface ReturnService {

    Integer create(Return ireturn);

    Page<Return> search(Integer pageNum);


}
