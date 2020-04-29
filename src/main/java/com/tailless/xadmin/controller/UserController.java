package com.tailless.xadmin.controller;

import com.tailless.xadmin.entity.User;
import com.tailless.xadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2019/08/16
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public List<User> getUserList(){
        return userService.getAllUser();
    }
}
