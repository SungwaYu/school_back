package pers.sungwa.school.service.edu.entity.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author sungwa
 * @date 9/14/20
 */
@Data
public class ExcelSubjectData {

    @ExcelProperty(value = "一级分类")
    private String levelOneTitle;

    @ExcelProperty(value = "二级分类")
    private String levelTwoTitle;
}
