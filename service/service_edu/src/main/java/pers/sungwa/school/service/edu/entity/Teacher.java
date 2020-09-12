package pers.sungwa.school.service.edu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import pers.sungwa.school.service.base.model.BaseEntity;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 讲师
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("edu_teacher")
@ApiModel(value="Teacher对象", description="讲师")
public class Teacher extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "teacher name")
    private String name;

    @ApiModelProperty(value = "teacher intro")
    private String intro;

    @ApiModelProperty(value = "teacher career")
    private String career;

    @ApiModelProperty(value = "level 1.experience taecher  2.expert teacher")
    private Integer level;

    @ApiModelProperty(value = "teacher avatar")
    private String avatar;

    @ApiModelProperty(value = "sort")
    private Integer sort;

    @ApiModelProperty(value = "join time")
    private Date joinDate;

    @ApiModelProperty(value = "fake delete   1(ture) deleted， 0(false) not deleted")
    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;


}
