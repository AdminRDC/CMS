package com.briup.apps.app01.web.controller;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.StudentCourse;
import com.briup.apps.app01.bean.extend.StudentCourseExtend;
import com.briup.apps.app01.service.ICourseService;
import com.briup.apps.app01.service.IStudentCourseService;
import com.briup.apps.app01.utils.Message;
import com.briup.apps.app01.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: app01
 * @description: 选课Controller
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

    @PostMapping("updateStudentCourse")
    public Message updateStudentCourse(StudentCourse studentCourse) {
        iStudentCourseService.updateStudentCourse(studentCourse);
        return MessageUtil.success("success");
    }

    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(StudentCourse studentCourse) {
        iStudentCourseService.saveOrUpdate(studentCourse);
        return MessageUtil.success("success");
    }

    @GetMapping("deleteStudentCourseById")
    public Message deleteStudentCourseById(Long id) {
        iStudentCourseService.deleteStudentCourseById(id);
        return MessageUtil.success("success");
    }

    @PostMapping("deleteScBanchByIds")
    public Message deleteScBanchByIds(@RequestBody Long[] ids) {
        iStudentCourseService.deleteScBanchByIds(ids);
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

    @GetMapping("findAllWithStudentCourse")
    public Message findAllWithStudentCourse() {
        return MessageUtil.success(iStudentCourseService.findAllWithStudentCourse());
    }
}
