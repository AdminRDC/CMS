package com.briup.apps.app01.service.Impl;

import com.briup.apps.app01.bean.User;
import com.briup.apps.app01.bean.UserExample;
import com.briup.apps.app01.mapper.UserMapper;
import com.briup.apps.app01.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: app01
 * @description: 用户接口实现类
 * @author: CC
 * @create: 2019/05/03 20:20
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public User findUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
