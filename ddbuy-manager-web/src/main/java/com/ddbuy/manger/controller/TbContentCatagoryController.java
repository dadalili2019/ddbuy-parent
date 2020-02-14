package com.ddbuy.manger.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ddbuy.entity.TbContentCategory;
import com.ddbuy.service.TbContentCategroyService;
import com.ddbuy.utils.PageUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author caoqian
 * @ClassName TbContentCatagoryController
 * @Date 2020/2/15 4:09
 * @Version 1.0
 */
@Controller
public class TbContentCatagoryController {

    //调用服务接口
    @Reference(interfaceClass = TbContentCategroyService.class, check = false)
    private TbContentCategroyService tbContentCategroyService;

    /**
     * 查询所有类别
     *
     * @param pageUtil
     * @return
     */
    @RequestMapping("/getTbContentCategory.do")
    @ResponseBody
    public Map<String, Object> getTbContentCategory(PageUtil pageUtil) {
        //调用服务
        PageInfo<TbContentCategory> pageInfo = tbContentCategroyService.getContentCategoryByPage(pageUtil);
        //创建map返回异步数据对接easyui
        Map<String, Object> map = new HashMap<>();
        map.put("total", pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }
}
