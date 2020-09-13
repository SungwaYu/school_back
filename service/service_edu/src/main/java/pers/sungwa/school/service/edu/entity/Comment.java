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
 * 评论
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("edu_comment")
@ApiModel(value="Comment对象", description="评论")
public class Comment extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "course id")
    private String courseId;

    @ApiModelProperty(value = "teacher id")
    private String teacherId;

    @ApiModelProperty(value = "student id")
    private String studentId;

    @ApiModelProperty(value = "student name")
    private String nickname;

    @ApiModelProperty(value = "student avatar")
    private String avatar;

    @ApiModelProperty(value = "comment content")
    private String content;


}
