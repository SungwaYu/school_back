package pers.sungwa.school.service.edu.controller.admin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.common.base.result.ResultCodeEnum;
import pers.sungwa.school.common.base.util.ExceptionUtils;
import pers.sungwa.school.service.base.exception.SchoolException;
import pers.sungwa.school.service.edu.entity.vo.SubjectVo;
import pers.sungwa.school.service.edu.service.SubjectService;

import java.io.InputStream;
import java.util.List;

/**
 * @author sungwa
 * @date 9/14/20
 */
//@CrossOrigin //允许跨域
@Api("课程分类管理")
@RestController
@RequestMapping("/admin/edu/subject")
@Slf4j
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @ApiOperation("Excel批量导入课程分类")
    @PostMapping("import")
    public R batchImport(
            @ApiParam(value = "Excel文件", required = true)
            @RequestParam("file") MultipartFile file){

        try {
            InputStream inputStream = file.getInputStream();
            subjectService.batchImport(inputStream);
            return R.ok().message("批量导入成功");
        } catch (Exception e) {
            log.error(ExceptionUtils.getMessage(e));
            throw new SchoolException(ResultCodeEnum.EXCEL_DATA_IMPORT_ERROR);
        }
    }

    @ApiOperation("嵌套数据列表")
    @GetMapping("nested-list")
    public R nestedList(){
        List<SubjectVo> subjectVoList = subjectService.nestedList();
        return R.ok().data("items", subjectVoList);
    }
}
