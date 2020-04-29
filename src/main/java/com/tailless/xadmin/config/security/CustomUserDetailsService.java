package com.tailless.xadmin.config.security;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.tailless.xadmin.entity.Role;
import com.tailless.xadmin.entity.User;
import com.tailless.xadmin.entity.UserRole;
import com.tailless.xadmin.mapper.PermissionMapper;
import com.tailless.xadmin.mapper.RoleMapper;
import com.tailless.xadmin.mapper.UserMapper;
import com.tailless.xadmin.mapper.UserRoleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2019/08/21
 */
@Slf4j
@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getUsername, username));
//        List<Role> roleList = userRoleMapper.selectList(new LambdaQueryWrapper<UserRole>().eq(UserRole::getUserId,user.getId()));
        return new CustomUserDetails(user);
    }
}
