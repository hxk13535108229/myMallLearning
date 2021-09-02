package com.hxk.mall.tiny.controller;

import com.hxk.mall.tiny.common.api.CommonResult;
import com.hxk.mall.tiny.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName UmsMemberController
 * @Description 会员登录注册管理Controller
 * @Author OvO
 * @Date 2021-08-30 16:35
 * @Version 1.0
 **/
@Controller
@Api(tags = "UmsMemberController",description = "会员登录注册管理")
@RequestMapping("/sso")
public class UmsMemberController {

    @Autowired
    private  UmsMemberService umsMemberService;

    @ApiOperation("获取验证码")
    @RequestMapping(value = "getAuthCode",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone){
        return umsMemberService.generatorAuthCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String telephone,
                                       @RequestParam String authCode) {
        return umsMemberService.verifyAuthCode(telephone,authCode);
    }

}
