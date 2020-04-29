package com.tailless.xadmin.service;

import com.tailless.xadmin.entity.User;

import java.util.List;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2019/08/16
 */
public interface UserService {

    /**
     * 获取所有用户列表
     *
     * @return  userLIst
     */
    List<User> getAllUser();
}
