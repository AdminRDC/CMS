package com.briup.apps.app01.service.Impl;

import com.briup.apps.app01.bean.StudentCourse;
import com.briup.apps.app01.bean.StudentCourseExample;
import com.briup.apps.app01.mapper.StudentCourseMapper;
import com.briup.apps.app01.service.IStudentCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: app01
 * @description: 学生选课接口实现类
 * @author: CC
 * @create: 2019/05/03 20:36
 */
@Service
public class StudentCourseImpl implements IStudentCourseService {
    @Resource
    private StudentCourseMapper studentCourseMapper;
    @Override
    public void saveStudentCourse(StudentCourse studentCourse) {
        studentCourseMapper.insert(studentCourse);
    }

    @Override
    public void updateStudentCourse(StudentCourse studentCourse) {
        studentCourseMapper.updateByPrimaryKey(studentCourse);
    }

    @Override
    public void deleteStudentCourseById(Long id) {
        studentCourseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public StudentCourse findStudentCourseById(Long id) {
        return studentCourseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<StudentCourse> findAll() {
        return studentCourseMapper.selectByExample(new StudentCourseExample());
    }
}
