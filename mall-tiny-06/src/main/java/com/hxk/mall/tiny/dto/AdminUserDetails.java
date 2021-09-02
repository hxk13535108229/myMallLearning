package com.hxk.mall.tiny.dto;

import com.hxk.mall.tiny.mbg.model.UmsAdmin;
import com.hxk.mall.tiny.mbg.model.UmsPermission;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName AdminUserDetails
 * @Description TODO
 * @Author OvO
 * @Date 2021-08-31 11:16
 * @Version 1.0
 **/
public class AdminUserDetails implements UserDetails {
    private UmsAdmin umsAdmin;
    private List<UmsPermission> umsPermissionList;

    public AdminUserDetails(UmsAdmin umsAdmin, List<UmsPermission> umsPermissionList) {
        this.umsAdmin = umsAdmin;
        this.umsPermissionList = umsPermissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return umsPermissionList.stream()
                .filter(umsPermission -> umsPermission.getValue()!=null)
                .map(umsPermission -> new SimpleGrantedAuthority(umsPermission.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 账号启用状态 启用--1  禁用--0
     * @return
     */
    @Override
    public boolean isEnabled() {
        return umsAdmin.getStatus().equals(1);
    }
}
