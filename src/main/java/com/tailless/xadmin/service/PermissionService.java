package com.tailless.xadmin.service;

import com.tailless.xadmin.entity.Permission;

import java.util.List;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2020/02/24
 */
public interface PermissionService {
    /**
     * @return 获取所有菜单
     */
    List<Permission> getAllPermission();
}
