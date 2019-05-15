package com.briup.apps.app01.web.controller;

import com.briup.apps.app01.bean.Phone;
import com.briup.apps.app01.service.IPhoneService;
import com.briup.apps.app01.utils.Message;
import com.briup.apps.app01.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: app01
 * @description:
 * @author: CC
 * @create: 2019/05/03 20:20
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private IPhoneService phoneService;

    @GetMapping("findAll")
    public Message findAll() {
        List<Phone> list = phoneService.findAll();
        return MessageUtil.success(list);
    }


    @GetMapping("findById")
    public Message findById(Long id) {

        return MessageUtil.success(phoneService.findById(id));
    }

    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Phone phone) {
        phoneService.saveOrUpdate(phone);
        return MessageUtil.success("success");
    }


}
