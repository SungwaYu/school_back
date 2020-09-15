package pers.sungwa.school.service.cms.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import pers.sungwa.school.service.cms.entity.Ad;
import pers.sungwa.school.service.cms.entity.vo.AdVo;

import java.util.List;

/**
 * <p>
 * 广告推荐 Mapper 接口
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
public interface AdMapper extends BaseMapper<Ad> {

    List<AdVo> selectPageByQueryWrapper(
            Page<AdVo> pageParam,
            @Param(Constants.WRAPPER) QueryWrapper<AdVo> queryWrapper);
}
