package com.briup.apps.app01.web.controller;

import com.briup.apps.app01.bean.User;
import com.briup.apps.app01.service.IUserService;
import com.briup.apps.app01.utils.Message;
import com.briup.apps.app01.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: app01
 * @description:
 * @author: CC
 * @create: 2019/05/03 20:27
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @PostMapping("/saveUser")
    public Message saveUser(User user) {
        iUserService.saveUser(user);
        return MessageUtil.success("success");
    }

    @GetMapping("/updateUser")
    public Message updateUser(User user) {
        iUserService.updateUser(user);
        return MessageUtil.success("success");
    }

    @GetMapping("/deleteUserById")
    public Message deleteUserById(Long id) {
        iUserService.deleteUserById(id);
        return MessageUtil.success("success");
    }

    @GetMapping("/findAll")
    public Message findAll() {
        return MessageUtil.success(iUserService.findAll());
    }

    @GetMapping("/findUserById")
    public Message findUserById(Long id) {
        return MessageUtil.success(iUserService.findUserById(id));
    }

}
