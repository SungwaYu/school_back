package pers.sungwa.school.service.edu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import pers.sungwa.school.service.edu.entity.Subject;
import pers.sungwa.school.service.edu.entity.vo.SubjectVo;

import java.util.List;

/**
 * <p>
 * 课程科目 Mapper 接口
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
@Repository
public interface SubjectMapper extends BaseMapper<Subject> {

    List<SubjectVo> selectNestedListByParentId(String parentId);
}
