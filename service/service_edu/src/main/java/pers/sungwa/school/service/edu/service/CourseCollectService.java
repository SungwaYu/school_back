package pers.sungwa.school.service.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.sungwa.school.service.edu.entity.CourseCollect;
import pers.sungwa.school.service.edu.entity.vo.CourseCollectVo;

import java.util.List;

/**
 * <p>
 * 课程收藏 服务类
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
public interface CourseCollectService extends IService<CourseCollect> {

    boolean isCollect(String courseId, String memberId);

    void saveCourseCollect(String courseId, String memberId);

    List<CourseCollectVo> selectListByMemberId(String memberId);

    boolean removeCourseCollect(String courseId, String memberId);
}
