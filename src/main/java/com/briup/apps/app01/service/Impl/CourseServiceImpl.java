package com.briup.apps.app01.service.Impl;

import com.briup.apps.app01.bean.*;
import com.briup.apps.app01.bean.extend.CourseExtend;
import com.briup.apps.app01.mapper.CourseMapper;
import com.briup.apps.app01.mapper.StudentCourseMapper;
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
    @Resource
    private StudentCourseMapper studentCourseMapper;

    @Override
    public void saveCourse(Course course) {
        courseMapper.insert(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateByPrimaryKey(course);
    }

    @Override
    public void saveOrUpdate(Course course) {
        if(course.getId()!= null){
            courseMapper.updateByPrimaryKey(course);
        } else {
            courseMapper.insert(course);
        }
    }

    @Override
    public void deleteCourseById(Long id) {
        deleteCourse_idOfStudentCourse(id);
        courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteCourse_idOfStudentCourse(Long id) {
        StudentCourseExample example = new StudentCourseExample();
        example.createCriteria().andCourseIdEqualTo(id);
        List<StudentCourse> studentCourses = studentCourseMapper.selectByExample(example);
        for(StudentCourse studentCourse : studentCourses){
            studentCourse.setCourseId(null);
            studentCourseMapper.updateByPrimaryKey(studentCourse);
        }
    }

    @Override
    public void deleteCourseBanchByIds(Long[] ids) {
        for(long id : ids){
            deleteCourse_idOfStudentCourse(id);
            courseMapper.deleteByPrimaryKey(id);
        }
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
