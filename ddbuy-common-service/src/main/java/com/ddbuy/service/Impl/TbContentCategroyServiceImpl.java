package com.ddbuy.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ddbuy.entity.TbContentCategory;
import com.ddbuy.entity.TbContentCategoryExample;
import com.ddbuy.mapper.TbContentCategoryMapper;
import com.ddbuy.service.TbContentCategroyService;
import com.ddbuy.utils.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author caoqian
 * @ClassName TbContentCategroyServiceImpl
 * @Date 2020/2/15 4:04
 * @Version 1.0
 */
@Service(interfaceClass = TbContentCategroyService.class)//注册服务
@Component
public class TbContentCategroyServiceImpl implements TbContentCategroyService {

    @Autowired(required = false)
    private TbContentCategoryMapper TbContentCategoryMapper;

    /**
     * 查询所有类别
     *
     * @param pageUtil
     * @return
     */
    @Override
    public PageInfo<TbContentCategory> getContentCategoryByPage(PageUtil pageUtil) {
        //开启分页
        PageHelper.startPage(pageUtil.getPage(), pageUtil.getRows());
        List<TbContentCategory> list = TbContentCategoryMapper.selectByExample(new TbContentCategoryExample());
        return new PageInfo<TbContentCategory>(list);
    }
}
