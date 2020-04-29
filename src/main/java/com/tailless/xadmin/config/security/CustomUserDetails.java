package com.tailless.xadmin.config.security;

import com.tailless.xadmin.common.constant.CommonConstant;
import com.tailless.xadmin.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2019/08/21
 */
public class CustomUserDetails extends User implements UserDetails {


    private static final long serialVersionUID = -3118150879768159728L;

    public CustomUserDetails(User user){
        if(user!=null){
            this.setUsername(user.getUsername());
            this.setPassword(user.getPassword());
            this.setStatus(user.getStatus());
            this.setPermissions(user.getPermissions());
            this.setRoles(user.getRoles());
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    /**
     * 是否过期
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 是否锁定
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return !CommonConstant.USER_STATUS_LOCK.equals(this.getStatus());
    }

    /**
     * 密码是否过期
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    /**
     * 是否启用
     * @return
     */
    @Override
    public boolean isEnabled() {
        return !CommonConstant.USER_STATUS_NORMAL.equals(this.getStatus());
    }
}
