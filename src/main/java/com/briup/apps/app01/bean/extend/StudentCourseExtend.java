package com.briup.apps.app01.bean.extend;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.StudentCourse;
import com.briup.apps.app01.bean.User;

/**
 * @program: app01
 * @description: 选课扩展类
 * @author: CC
 * @create: 2019/05/16 19:42
 */
public class StudentCourseExtend extends StudentCourse {
    private User student;
    private Course course;

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}