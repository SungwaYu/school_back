package pers.sungwa.school.service.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.sungwa.school.service.edu.entity.Video;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
public interface VideoService extends IService<Video> {

    void removeMediaVideoById(String id);

    void removeMediaVideoByChapterId(String chapterId);

    void removeMediaVideoByCourseId(String chapterId);
}

