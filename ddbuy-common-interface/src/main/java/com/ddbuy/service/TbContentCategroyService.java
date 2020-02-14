package com.ddbuy.service;

import com.ddbuy.entity.TbContentCategory;
import com.ddbuy.utils.PageUtil;
import com.github.pagehelper.PageInfo;

/**
 * @Author caoqian
 * @ClassName TbContentCategroyService
 * @Date 2020/2/15 4:00
 * @Version 1.0
 */
public interface TbContentCategroyService {
    //查询所有类别分页
    PageInfo<TbContentCategory> getContentCategoryByPage(PageUtil pageUtil);
}
