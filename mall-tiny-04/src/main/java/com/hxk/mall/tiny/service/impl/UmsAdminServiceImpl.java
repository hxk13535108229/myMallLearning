package com.hxk.mall.tiny.service.impl;

import com.hxk.mall.tiny.common.utils.JwtTokenUtil;
import com.hxk.mall.tiny.dao.UmsAdminRoleRelationDao;
import com.hxk.mall.tiny.mbg.mapper.UmsAdminMapper;
import com.hxk.mall.tiny.mbg.model.UmsAdmin;
import com.hxk.mall.tiny.mbg.model.UmsPermission;
import com.hxk.mall.tiny.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UmsAdminServiceImpl
 * @Description TODO
 * @Author OvO
 * @Date 2021-08-31 11:28
 * @Version 1.0
 **/
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private UmsAdminMapper adminMapper;
    @Autowired
    private UmsAdminRoleRelationDao adminRoleRelationDao;


    @Override
    public UmsAdmin getAdminByUsername(String username) {
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdmin umsAdminParam) {
        return null;
    }

    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return null;
    }
}
