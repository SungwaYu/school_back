package pers.sungwa.school.service.edu.service;

import pers.sungwa.school.service.edu.entity.Chapter;
import com.baomidou.mybatisplus.extension.service.IService;
import pers.sungwa.school.service.edu.entity.vo.ChapterVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
public interface ChapterService extends IService<Chapter> {

    boolean removeChapterById(String id);

    List<ChapterVo> nestedList(String courseId);
}
