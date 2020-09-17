package pers.sungwa.school.service.edu.controller.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.service.base.dto.CourseDto;
import pers.sungwa.school.service.edu.entity.Course;
import pers.sungwa.school.service.edu.entity.vo.ChapterVo;
import pers.sungwa.school.service.edu.entity.vo.WebCourseQueryVo;
import pers.sungwa.school.service.edu.entity.vo.WebCourseVo;
import pers.sungwa.school.service.edu.service.ChapterService;
import pers.sungwa.school.service.edu.service.CourseService;

import java.util.List;

/**
 * @author sungwa
 * @date 9/16/20
 */
//@CrossOrigin
@Api("课程")
@RestController
@RequestMapping("/api/edu/course")
public class ApiCourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private ChapterService chapterService;

    @ApiOperation("课程列表")
    @GetMapping("list")
    public R pageList(
            @ApiParam(value = "查询对象", required = true)
                    WebCourseQueryVo webCourseQueryVo){

        List<Course> courseList = courseService.webSelectList(webCourseQueryVo);

        return R.ok().data("courseList", courseList);
    }

    @ApiOperation("根据id查询课程")
    @GetMapping("get/{courseId}")
    public R getById(
            @ApiParam(value = "课程id", required = true)
            @PathVariable String courseId){

        //查询课程信息和讲师信息
        WebCourseVo webCourseVo = courseService.selectWebCourseVoById(courseId);

        //查询当前课程的嵌套章节和课时信息
        List<ChapterVo> chapterVoList = chapterService.nestedList(courseId);

        return R.ok().data("course", webCourseVo).data("chapterVoList", chapterVoList);
    }

    @ApiOperation("根据课程id查询课程信息")
    @GetMapping("inner/get-course-dto/{courseId}")
    public CourseDto getCourseDtoById(
            @ApiParam(value = "课程ID", required = true)
            @PathVariable String courseId){
        CourseDto courseDto = courseService.getCourseDtoById(courseId);
        return courseDto;
    }
}
