package com.briup.apps.app01.service;

import com.briup.apps.app01.bean.User;

import java.util.List;

public interface IUserService {
    /**
     * @Description: 新增学生信息
     * @Param: [user]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/4 12:08
     */
    void saveUser(User user);

    /**
     * @Description: 更新学生信息
     * @Param: [user]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/4 12:09
     */
    void updateUser(User user);

    /**
     * @Description: 根据学生id删除学生信息
     * @Param: [id]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/4 12:18
     */
    void deleteUserById(Long id);

    /**
     * @Description: 查找所有学生信息
     * @Param: []
     * @return: java.util.List<com.briup.apps.app01.bean.User>
     * @Author: CC
     * @Date: 2019/5/4 12:09
     */
    List<User> findAll();

    /**
     * @Description: 根据学生id查询学生信息
     * @Param: [id]
     * @return: com.briup.apps.app01.bean.User
     * @Author: CC
     * @Date: 2019/5/4 12:13
     */
    User findUserById(Long id);

}
