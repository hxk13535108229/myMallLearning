package com.hxk.mall.tiny.common.api;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

/**
 * @ClassName CommonPage
 * @Description 分页数据封装类
 * @Author OvO
 * @Date 2021-08-29 11:27
 * @Version 1.0
 **/
@Data
public class CommonPage<T> {

    //当前页数
    private Integer pageNum;

    //每页的条数
    private Integer pageSize;

    //总页数
    private Integer totalPage;

    //总条数
    private Long total;

    //列表
    private List<T> list;

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> CommonPage<T> restPage(List<T> list){
        CommonPage<T> result = new CommonPage<>();
        PageInfo<T> pageInfo = new PageInfo<>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        System.out.println(result.toString());
        return result;
    }

}
