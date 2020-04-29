package com.tailless.xadmin.service.impl;

import com.tailless.xadmin.common.utils.RedisUtil;
import com.tailless.xadmin.entity.User;
import com.tailless.xadmin.mapper.UserMapper;
import com.tailless.xadmin.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2019/08/16
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisUtil redisUtil;


    /**
     * 获取所有用户列表
     *
     * @return userLIst
     */
    @Override
    public List<User> getAllUser() {
        Map u = new HashMap(16);
        u.put("name","tailless");
        redisUtil.putAll("user",u);
        log.info("Get Value From Redis {} ",redisUtil.getHashEntries("user"));
        return userMapper.selectList(null);
    }
}
