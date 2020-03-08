package io.ljh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.ljh.jcartadministrationback.po.Return;

public interface ReturnService {
    Page<Return> search(Integer pageNum);
}
