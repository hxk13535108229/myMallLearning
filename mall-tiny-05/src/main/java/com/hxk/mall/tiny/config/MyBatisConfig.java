package com.hxk.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
  *@ClassName MyBatisConfig
  *@Description TODO
  *@Author OvO
  *@Date 2021-08-29 10:58
  *@Version 1.0
  **/
@Configuration
@MapperScan({"com.hxk.mall.tiny.mbg.mapper","com.hxk.mall.tiny.dao"})
public class MyBatisConfig {

}
