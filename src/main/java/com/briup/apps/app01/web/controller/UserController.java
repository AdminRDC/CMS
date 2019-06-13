package com.briup.apps.app01.web.controller;

import com.briup.apps.app01.bean.User;
import com.briup.apps.app01.service.IUserService;
import com.briup.apps.app01.utils.Message;
import com.briup.apps.app01.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: app01
 * @description: 用户Controller
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

    @PostMapping("/updateUser")
    public Message updateUser(User user) {
        iUserService.updateUser(user);
        return MessageUtil.success("success");
    }

    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdate(User user) {
        iUserService.saveOrUpdate(user);
        return MessageUtil.success("success");
    }

    @GetMapping("/deleteUserById")
    public Message deleteUserById(Long id) {
        iUserService.deleteUserById(id);
        return MessageUtil.success("success");
    }

    @PostMapping("deleteUserBanchByIds")
    public Message deleteUserBanchByIds(@RequestBody Long[] ids) {
        iUserService.deleteUserBanchByIds(ids);
        return MessageUtil.success("success");
    }

    @GetMapping("/findAll")
    public Message findAll() {
        return MessageUtil.success(iUserService.findAll());
    }

    @GetMapping("/findAllStudent")
    public Message findAllStudent() {
        return MessageUtil.success(iUserService.findAllStudent());
    }

    @GetMapping("/findAllTeacher")
    public Message findAllTeacher() {
        return MessageUtil.success(iUserService.findAllTeacher());
    }

    @GetMapping("/findUserById")
    public Message findUserById(Long id) {
        return MessageUtil.success(iUserService.findUserById(id));
    }


}
