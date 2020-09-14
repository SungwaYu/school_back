package pers.sungwa.school.service.edu.controller.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.service.edu.entity.Course;
import pers.sungwa.school.service.edu.entity.Teacher;
import pers.sungwa.school.service.edu.service.CourseService;
import pers.sungwa.school.service.edu.service.TeacherService;

import java.util.List;

/**
 * @author sungwa
 * @date 9/13/20 3:00 PM
 */
@Api(description="首页")
@RestController
@RequestMapping("/api/edu/index")
public class ApiIndexController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private TeacherService teacherService;

    @ApiOperation("课程和讲师的首页数据")
    @GetMapping
    public R index(){

        //查询热门课程
        List<Course> courseList = courseService.selectHotCourse();

        //查询推荐讲师
        List<Teacher> teacherList = teacherService.selectHotTeacher();

        return R.ok().data("courseList", courseList).data("teacherList", teacherList);
    }
}

