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
     * @Description: 新增或者修改
     * @Param: [user]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/16 17:27
     */
    void saveOrUpdate(User user);

    /**
     * @Description: 根据id删除用户信息
     * @Param: [id]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/4 12:18
     */
    void deleteUserById(Long id);

    /**
     * @Description: 从课程表中删除关联约束teacher_id
     * @Param: [teacher_id]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/16 17:26
     */
    void deleteTeacher_idOfCourse(Long teacher_id);

    /**
     * @Description: 从选课表中删除关联约束student_id
     * @Param: [student_id]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/16 17:26
     */
    void deleteStudent_idOfStudentCourse(Long student_id);

    /**
     * @Description: 批量删除
     * @Param: [ids]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/16 17:27
     */
    void deleteUserBanchByIds(Long[] ids);

    /**
     * @Description: 查找所有用户信息
     * @Param: []
     * @return: java.util.List<com.briup.apps.app01.bean.User>
     * @Author: CC
     * @Date: 2019/5/4 12:09
     */
    List<User> findAll();

    /**
     * @Description: 根据id查询用户信息
     * @Param: [id]
     * @return: com.briup.apps.app01.bean.User
     * @Author: CC
     * @Date: 2019/5/4 12:13
     */
    User findUserById(Long id);

    /**
     * @Description: 查询所有学生
     * @Param: []
     * @return: java.util.List<com.briup.apps.app01.bean.User>
     * @Author: CC
     * @Date: 2019/5/16 17:26
     */
    List<User> findAllStudent();

    /**
     * @Description: 查询所有老师
     * @Param: []
     * @return: java.util.List<com.briup.apps.app01.bean.User>
     * @Author: CC
     * @Date: 2019/5/16 17:26
     */
    List<User> findAllTeacher();
}
