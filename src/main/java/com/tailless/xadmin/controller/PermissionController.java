package com.tailless.xadmin.controller;

import com.tailless.xadmin.entity.Permission;
import com.tailless.xadmin.entity.User;
import com.tailless.xadmin.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2020/02/24
 */
@RestController
@RequestMapping("permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("list")
    public List<Permission> getPermissionList(){
        return permissionService.getAllPermission();
    }
}
