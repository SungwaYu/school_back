package pers.sungwa.school.service.edu.controller.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.service.edu.entity.vo.SubjectVo;
import pers.sungwa.school.service.edu.service.SubjectService;

import java.util.List;

/**
 * @author sungwa
 * @date 9/16/20
 */
//@CrossOrigin
@Api("课程分类")
@RestController
@RequestMapping("/api/edu/subject")
public class ApiSubjectController {

    @Autowired
    private SubjectService subjectService;

    @ApiOperation("嵌套数据列表")
    @GetMapping("nested-list")
    public R nestedList(){
        List<SubjectVo> subjectVoList = subjectService.nestedList();
        return R.ok().data("items", subjectVoList);
    }
}
