package com.hxk.mall.tiny.service;


import com.hxk.mall.tiny.mbg.model.PmsBrand;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName PmsBrandService
 * @Description TODO
 * @Author OvO
 * @Date 2021-08-29 19:21
 * @Version 1.0
 **/

public interface PmsBrandService {

    //展示所有品牌
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id,PmsBrand brand);

    int deleteBrand(Long id);

    //分页展示
    List<PmsBrand> listBrand(int pageNum,int pageSize);

    PmsBrand getBrand(Long id);
}
