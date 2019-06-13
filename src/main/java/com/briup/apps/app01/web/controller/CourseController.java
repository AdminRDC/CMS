package com.briup.apps.app01.web.controller;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.User;
import com.briup.apps.app01.service.ICourseService;
import com.briup.apps.app01.utils.Message;
import com.briup.apps.app01.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: app01
 * @description: 课程Controller
 * @author: CC
 * @create: 2019/05/03 20:20
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;

    @PostMapping("saveCourse")
    public Message saveCourse(Course course) {
        courseService.saveCourse(course);
        return MessageUtil.success("success");
    }

    @PostMapping("updateCourse")
    public Message updateCourse(Course course) {
        courseService.updateCourse(course);
        return MessageUtil.success("success");
    }

    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Course course) {
        courseService.saveOrUpdate(course);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteCourseById")
    public Message deleteCourseById(Long id) {
        courseService.deleteCourseById(id);
        return MessageUtil.success("success");
    }

    @PostMapping("deleteCourseBanchByIds")
    public Message deleteCourseBanchByIds(@RequestBody Long[] ids) {
        courseService.deleteCourseBanchByIds(ids);
        return MessageUtil.success("success");
    }

    @GetMapping("findCourseById")
    public Message findCourseById(Long id) {
        return MessageUtil.success(courseService.findCourseById(id));
    }

    @GetMapping("findAll")
    public Message findAll() {
        return MessageUtil.success(courseService.findAll());
    }

    @GetMapping("findAllWithTeacher")
    public Message findAllWithTeacher() {
        return MessageUtil.success(courseService.findAllWithTeacher());
    }
}

