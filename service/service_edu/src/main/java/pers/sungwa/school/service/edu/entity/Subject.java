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
 * 课程科目
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("edu_subject")
@ApiModel(value="Subject对象", description="课程科目")
public class Subject extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "subject title")
    private String title;

    @ApiModelProperty(value = "parent id")
    private String parentId;

    @ApiModelProperty(value = "sort")
    private Integer sort;


}
