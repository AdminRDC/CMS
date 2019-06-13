package com.briup.apps.app01.service;

import com.briup.apps.app01.bean.Course;
import com.briup.apps.app01.bean.User;
import com.briup.apps.app01.bean.extend.CourseExtend;

import java.util.List;

public interface ICourseService {
    /**
     * @Description: 新增选课信息
     * @Param: [course]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/5 9:05
     */
    void saveCourse(Course course);

    /**
     * @Description: 更新选课信息
     * @Param: [course]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/5 9:06
     */
    void updateCourse(Course course);

    /**
     * @Description: 新增或更改信息
     * @Param: [course]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/16 19:25
     */
    void saveOrUpdate(Course course);

    /**
     * @Description: 根据ID删除选课信息
     * @Param: [id]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/5 9:06
     */
    void deleteCourseById(Long id);

    /**
     * @Description: 关联约束course_id删除
     * @Param: [id]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/16 19:26
     */
    void deleteCourse_idOfStudentCourse(Long id);

    /**
     * @Description: 批量删除
     * @Param: [ids]
     * @return: void
     * @Author: CC
     * @Date: 2019/5/16 19:30
     */
    void deleteCourseBanchByIds(Long[] ids);

    /**
     * @Description: 根据ID查找选课信息
     * @Param: [id]
     * @return: com.briup.apps.app01.bean.Course
     * @Author: CC
     * @Date: 2019/5/5 9:06
     */
    Course findCourseById(Long id);

    /**
     * @Description: 查找所有选课信息
     * @Param: []
     * @return: java.util.List<com.briup.apps.app01.bean.Course>
     * @Author: CC
     * @Date: 2019/5/5 9:06
     */
    List<Course> findAll();

    /**
     * @Description: 查询所有课程包括老师信息
     * @Param: []
     * @return: java.util.List<com.briup.apps.app01.bean.extend.CourseExtend>
     * @Author: CC
     * @Date: 2019/5/16 19:24
     */
    List<CourseExtend> findAllWithTeacher();
}
