package com.tailless.xadmin.service.impl;

import com.tailless.xadmin.entity.Permission;
import com.tailless.xadmin.mapper.PermissionMapper;
import com.tailless.xadmin.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2020/02/24
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    PermissionMapper permissionMapper;
    /**
     * @return 获取所有菜单
     */
    @Override
    public List<Permission> getAllPermission() {
        return permissionMapper.selectList(null);
    }
}
