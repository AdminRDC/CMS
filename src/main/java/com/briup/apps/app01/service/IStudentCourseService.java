package com.briup.apps.app01.service;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.StudentCourse;
import com.briup.apps.app01.bean.extend.CourseExtend;

import java.util.List;

public interface IStudentCourseService {
    /**
     * @Description: 保存学生选课信息
     * @Param: [studentCourse]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/5 9:04
     */
    void saveStudentCourse(StudentCourse studentCourse);

    /**
     * @Description: 更新学生选课信息
     * @Param: [studentCourse]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/5 9:04
     */
    void updateStudentCourse(StudentCourse studentCourse);

    /**
     * @Description: 根据ID删除学生选课信息
     * @Param: [id]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/5 9:04
     */
    void deleteStudentCourseById(Long id);

    /**
     * @Description: 根据ID查找学生选课信息
     * @Param: [id]
     * @return: com.briup.apps.app01.bean.StudentCourse
     * @Author: CC
     * @Date: 2019/5/5 9:05
     */
    StudentCourse findStudentCourseById(Long id);

    /**
     * @Description: 查找所有学生选课信息
     * @Param: []
     * @return: java.util.List<com.briup.apps.app01.bean.StudentCourse>
     * @Author: CC
     * @Date: 2019/5/5 9:05
     */
    List<StudentCourse> findAll();

//    List<StudentCourseExtend> findAllWithTeacher();
}
