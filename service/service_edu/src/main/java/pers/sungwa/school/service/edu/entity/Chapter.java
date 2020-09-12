package pers.sungwa.school.service.edu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import pers.sungwa.school.service.base.model.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 课程
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("edu_chapter")
@ApiModel(value="Chapter对象", description="课程")
public class Chapter extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "course id")
    private String courseId;

    @ApiModelProperty(value = "chapter name")
    private String title;

    @ApiModelProperty(value = "sort")
    private Integer sort;


}
