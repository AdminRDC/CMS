package com.briup.apps.app01.mapper.extend;

import com.briup.apps.app01.bean.extend.CourseExtend;

import java.util.List;

/**
 * @program: app01
 * @description: 课程表扩展接口
 * @author: CC
 * @create: 2019/05/16 19:48
 */
public interface CourseExtendMapper {
    List<CourseExtend> selectAll();
}
