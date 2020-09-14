package pers.sungwa.school.service.edu.controller.admin;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.service.edu.entity.Teacher;
import pers.sungwa.school.service.edu.entity.vo.TeacherQueryVo;
import pers.sungwa.school.service.edu.service.TeacherService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
@Slf4j
//@CrossOrigin
@Api("Teacher Management")
@RestController
@RequestMapping("/admin/edu/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

//    @Autowired
//    private OssFileService ossFileService;

    @ApiOperation("Teacher full list")
    @GetMapping("list")
    public R listAll(){
        List<Teacher> list = teacherService.list();
        return R.ok().data("items",list);
    }

    @ApiOperation(value = "Delete teacher by id", notes = "Fake delete")
    @DeleteMapping("remove/{id}")
    public R removeById(@ApiParam(value = "Teacher ID", required = true) @PathVariable String id){

        //删除讲师头像
//        teacherService.removeAvatarById(id);

        boolean result = teacherService.removeById(id);
        if(result){
            return R.ok().message("Delete Successed");
        }else{
            return R.error().message("No such data");
        }
    }

    @ApiOperation("Teacher page list")
    @GetMapping("list/{page}/{limit}")
    public R listPage(@ApiParam(value = "Current page", required = true) @PathVariable Long page,
                      @ApiParam(value = "Number per page", required = true) @PathVariable Long limit,
                      @ApiParam("Teacher vo") TeacherQueryVo teacherQueryVo){

        Page<Teacher> pageParam = new Page<>(page, limit);
        IPage<Teacher> pageModel = teacherService.selectPage(pageParam, teacherQueryVo);
        List<Teacher> records = pageModel.getRecords();
        long total = pageModel.getTotal();
        return R.ok().data("total", total).data("rows", records);
    }

    @ApiOperation("Create teacher")
    @PostMapping("save")
    public R save(@ApiParam("Teacher object") @RequestBody Teacher teacher){
        teacherService.save(teacher);
        return R.ok().message("Succeess saved");
    }

    @ApiOperation("Update teacher")
    @PutMapping("update")
    public R updateById(@ApiParam("Teacher object") @RequestBody Teacher teacher){
        boolean result = teacherService.updateById(teacher);
        if(result){
            return R.ok().message("Success saved");
        }else{
            return R.error().message("No such data");
        }
    }

    @ApiOperation("Get teacher by id")
    @GetMapping("get/{id}")
    public R getById(@ApiParam("Teacher object") @PathVariable String id){
        Teacher teacher = teacherService.getById(id);
        if(teacher != null){
            return R.ok().data("item", teacher);
        }else{
            return R.error().message("No such data");
        }
    }

    @ApiOperation(value = "Delete teacher by id")
    @DeleteMapping("batch-remove")
    public R removeRows(
            @ApiParam(value = "Teacher id list", required = true)
            @RequestBody List<String> idList){
        boolean result = teacherService.removeByIds(idList);
        if(result){
            return R.ok().message("Suceess deleted");
        }else{
            return R.error().message("No such data");
        }
    }

    @ApiOperation("Search teacher by keyword")
    @GetMapping("list/name/{key}")
    public R selectNameListByKey(
            @ApiParam(value = "Keyword", required = true)
            @PathVariable String key){
        List<Map<String, Object>> nameList = teacherService.selectNameList(key);

        return R.ok().data("nameList", nameList);
    }

//    @ApiOperation("测试服务调用")
//    @GetMapping("test")
//    public R test(){
//        ossFileService.test();
//        log.info("edu operated");
//        return R.ok();
//    }

    @ApiOperation("测试并发")
    @GetMapping("test_concurrent")
    public R testConcurrent(){
        log.info("test_concurrent");
        return R.ok();
    }

    @GetMapping("/message1")
    public String message1() {
        return "message1";
    }

    @GetMapping("/message2")
    public String message2() {
        return "message2";
    }
}

