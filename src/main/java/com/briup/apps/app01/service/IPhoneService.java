package com.briup.apps.app01.service;

import com.briup.apps.app01.bean.Phone;

import java.util.List;

public interface IPhoneService {

    //添加/修改
    void saveOrUpdate(Phone phone);
    //查找
    Phone findById(long id);
    List<Phone> findAll();



}