package pers.sungwa.school.service.edu.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sungwa
 * @date 9/16/20
 */
@Data
public class VideoVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String title;
    private Boolean free;
    private Integer sort;

    private String videoSourceId;
}