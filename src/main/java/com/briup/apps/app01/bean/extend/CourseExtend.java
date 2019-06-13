package com.briup.apps.app01.bean.extend;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.User;

/**
 * @program: app01
 * @description:课程扩展类
 * @author: CC
 * @create: 2019/05/03 20:20
 */
public class CourseExtend extends Course {
    private User teacher;

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }
}
