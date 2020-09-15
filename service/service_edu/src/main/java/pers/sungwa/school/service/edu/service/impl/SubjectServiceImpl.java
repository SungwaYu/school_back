package pers.sungwa.school.service.edu.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pers.sungwa.school.service.edu.entity.Subject;
import pers.sungwa.school.service.edu.entity.excel.ExcelSubjectData;
import pers.sungwa.school.service.edu.entity.listener.ExcelSubjectDataListener;
import pers.sungwa.school.service.edu.entity.vo.SubjectVo;
import pers.sungwa.school.service.edu.mapper.SubjectMapper;
import pers.sungwa.school.service.edu.service.SubjectService;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 课程科目 服务实现类
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements SubjectService {

    @Override
    public void batchImport(InputStream inputStream) {
        EasyExcel.read(inputStream, ExcelSubjectData.class, new ExcelSubjectDataListener(baseMapper))
                .excelType(ExcelTypeEnum.XLS)
                .sheet().doRead();
    }

    @Override
    public List<SubjectVo> nestedList() {
        return baseMapper.selectNestedListByParentId("0");
    }
}

