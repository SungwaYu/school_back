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
 * 课程视频
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("edu_video")
@ApiModel(value="Video对象", description="课程视频")
public class Video extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "course id")
    private String courseId;

    @ApiModelProperty(value = "chapter id")
    private String chapterId;

    @ApiModelProperty(value = "chapter name")
    private String title;

    @ApiModelProperty(value = "video sourse")
    private String videoSourceId;

    @ApiModelProperty(value = "origin file name")
    private String videoOriginalName;

    @ApiModelProperty(value = "sort")
    private Integer sort;

    @ApiModelProperty(value = "play times")
    private Long playCount;

    @ApiModelProperty(value = "free?：0 not free 1 free")
    @TableField("is_free")
    private Boolean free;

    @ApiModelProperty(value = "video time (second)")
    private Float duration;

    @ApiModelProperty(value = "status")
    private String status;

    @ApiModelProperty(value = "video space")
    private Long size;

    @ApiModelProperty(value = "positive lock")
    private Long version;


}
