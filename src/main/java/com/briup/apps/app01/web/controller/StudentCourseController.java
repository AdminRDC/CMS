package com.briup.apps.app01.web.controller;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.StudentCourse;
import com.briup.apps.app01.service.ICourseService;
import com.briup.apps.app01.service.IStudentCourseService;
import com.briup.apps.app01.utils.Message;
import com.briup.apps.app01.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: app01
 * @description: 学生选课
 * @author: CC
 * @create: 2019/05/03 20:37
 */
@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {
    @Autowired
    private IStudentCourseService iStudentCourseService;

    @PostMapping("saveStudentCourse")
    public Message saveStudentCourse(StudentCourse studentCourse) {
        iStudentCourseService.saveStudentCourse(studentCourse);
        return MessageUtil.success("success");
    }

    @GetMapping("updateStudentCourse")
    public Message updateStudentCourse(StudentCourse studentCourse) {
        iStudentCourseService.updateStudentCourse(studentCourse);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteStudentCourseById")
    public Message deleteStudentCourseById(Long id) {
        iStudentCourseService.deleteStudentCourseById(id);
        return MessageUtil.success("success");
    }

    @GetMapping("findStudentCourseById")
    public Message findStudentCourseById(Long id) {
        return MessageUtil.success(iStudentCourseService.findStudentCourseById(id));
    }

    @GetMapping("findAll")
    public Message findAll() {
        return MessageUtil.success(iStudentCourseService.findAll());
    }

//    @GetMapping("findAllWithTeacher")
//    public Message findAllWithTeacher() {
//        return MessageUtil.success(iStudentCourseService.findAllWithTeacher());
//    }

}
