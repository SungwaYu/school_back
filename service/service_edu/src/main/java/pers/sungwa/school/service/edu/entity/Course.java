package pers.sungwa.school.service.edu.entity;

import java.math.BigDecimal;
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
 * @since 2020-09-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("edu_course")
@ApiModel(value="Course对象", description="课程")
public class Course extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "teacher id")
    private String teacherId;

    @ApiModelProperty(value = "subject id")
    private String subjectId;

    @ApiModelProperty(value = "subject parent id")
    private String subjectParentId;

    @ApiModelProperty(value = "course title")
    private String title;

    @ApiModelProperty(value = "price. 0 means free")
    private BigDecimal price;

    @ApiModelProperty(value = "total units")
    private Integer lessonNum;

    @ApiModelProperty(value = "avatar path")
    private String cover;

    @ApiModelProperty(value = "sell count")
    private Long buyCount;

    @ApiModelProperty(value = "view count")
    private Long viewCount;

    @ApiModelProperty(value = "positive lock")
    private Long version;

    @ApiModelProperty(value = "course status. Draft: not published  Normal: published")
    private String status;


}
