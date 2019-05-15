package com.briup.apps.app01.service.Impl;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.CourseExample;
import com.briup.apps.app01.bean.User;
import com.briup.apps.app01.bean.extend.CourseExtend;
import com.briup.apps.app01.mapper.CourseMapper;
import com.briup.apps.app01.mapper.extend.CourseExtendMapper;
import com.briup.apps.app01.service.ICourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: app01
 * @description: 课程接口实现类
 * @author: CC
 * @create: 2019/05/03 20:20
 */
@Service
public class CourseServiceImpl implements ICourseService {

    @Resource
    private CourseMapper courseMapper;
    @Resource
    private CourseExtendMapper courseExtendMapper;

    @Override
    public void saveCourse(Course course) {
        courseMapper.insert(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateByPrimaryKey(course);
    }

    @Override
    public void deleteCourseById(Long id) {
        courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Course findCourseById(Long id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Course> findAll() {
        CourseExample example = new CourseExample();
        return courseMapper.selectByExample(example);
    }

    @Override
    public List<CourseExtend> findAllWithTeacher() {
        return courseExtendMapper.selectAll();
    }
}
