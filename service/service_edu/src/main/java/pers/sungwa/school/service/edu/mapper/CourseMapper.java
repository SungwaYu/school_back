package pers.sungwa.school.service.edu.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import pers.sungwa.school.service.base.dto.CourseDto;
import pers.sungwa.school.service.edu.entity.Course;
import pers.sungwa.school.service.edu.entity.vo.CoursePublishVo;
import pers.sungwa.school.service.edu.entity.vo.CourseVo;
import pers.sungwa.school.service.edu.entity.vo.WebCourseVo;

import java.util.List;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
@Repository
public interface CourseMapper extends BaseMapper<Course> {

    List<CourseVo> selectPageByCourseQueryVo(
            Page<CourseVo> pageParam,
            @Param(Constants.WRAPPER) QueryWrapper<CourseVo> queryWrapper);

    CoursePublishVo selectCoursePublishVoById(String id);

    WebCourseVo selectWebCourseVoById(String id);

    CourseDto selectCourseDtoById(String courseId);
}
