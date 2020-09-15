package pers.sungwa.school.service.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.sungwa.school.service.edu.entity.Subject;
import pers.sungwa.school.service.edu.entity.vo.SubjectVo;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
public interface SubjectService extends IService<Subject> {

    void batchImport(InputStream inputStream);

    List<SubjectVo> nestedList();
}

