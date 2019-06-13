package com.briup.apps.app01.service.Impl;

import com.briup.apps.app01.bean.*;
import com.briup.apps.app01.mapper.CourseMapper;
import com.briup.apps.app01.mapper.StudentCourseMapper;
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
    @Resource
    private CourseMapper courseMapper;
    @Resource
    private StudentCourseMapper studentCourseMapper;
    /**
    *@Description: 仅新增
    *@Param: [user]
    *@return: void
    *@Author: CC
    *@Date: 2019/5/16 17:08
    */
    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }
    /**
    *@Description: 仅更新
    *@Param: [user]
    *@return: void
    *@Author: CC
    *@Date: 2019/5/16 17:08
    */
    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }
    /**
    *@Description: 新增或者更新
    *@Param: [user]
    *@return: void
    *@Author: CC
    *@Date: 2019/5/16 17:19
    */
    @Override
    public void saveOrUpdate(User user) {
        if(user.getId()!= null){
            userMapper.updateByPrimaryKey(user);
            System.out.println("更新");
        } else {
            userMapper.insert(user);
            System.out.println("保存");
        }
    }

    @Override
    public void deleteUserById(Long id) {
        if("老师".equals(userMapper.selectByPrimaryKey(id).getType())){
            deleteTeacher_idOfCourse(id);
        }
        if("学生".equals(userMapper.selectByPrimaryKey(id).getType())) {
            deleteStudent_idOfStudentCourse(id);
        }
        userMapper.deleteByPrimaryKey(id);
    }

    /**
    * @Description: 从课程表中删除关联约束teacher_id
    * @Param: [teacher_id]
    * @return: void
    * @Author: CC
    * @Date: 2019/5/16 18:53
    */
    @Override
    public void deleteTeacher_idOfCourse(Long teacher_id) {
        CourseExample example = new CourseExample();
        example.createCriteria().andTeacherIdEqualTo(teacher_id);
        List<Course> courses = courseMapper.selectByExample(example);
        for(Course c :courses){
            c.setTeacherId(null);
            courseMapper.updateByPrimaryKey(c);
        }
    }
    
    /**
    * @Description: 从选课表中删除关联约束student_id
    * @Param: [student_id]
    * @return: void
    * @Author: CC
    * @Date: 2019/5/16 18:51
    */
    @Override
    public void deleteStudent_idOfStudentCourse(Long student_id) {
        StudentCourseExample example = new StudentCourseExample();
        example.createCriteria().andStudentIdEqualTo(student_id);
        List<StudentCourse> studentCourses = studentCourseMapper.selectByExample(example);
        for(StudentCourse sc :studentCourses){
            sc.setStudentId(null);
            studentCourseMapper.updateByPrimaryKey(sc);
        }
    }
    /**
    * @Description: 批量删除
    * @Param: [ids]
    * @return: void
    * @Author: CC
    * @Date: 2019/5/16 18:53
    */
    @Override
    public void deleteUserBanchByIds(Long[] ids) {
        for(long id : ids){
            if("老师".equals(userMapper.selectByPrimaryKey(id).getType())){
                deleteTeacher_idOfCourse(id);
            }
            if("学生".equals(userMapper.selectByPrimaryKey(id).getType())) {
                deleteStudent_idOfStudentCourse(id);
            }
            userMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public User findUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findAllStudent() {
        UserExample example = new UserExample();
        example.createCriteria().andTypeEqualTo("学生");
        return userMapper.selectByExample(example);
    }

    @Override
    public List<User> findAllTeacher() {
        UserExample example = new UserExample();
        example.createCriteria().andTypeEqualTo("老师");
        return userMapper.selectByExample(example);
    }
}
