package pers.sungwa.school.service.cms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import pers.sungwa.school.service.cms.entity.Ad;
import pers.sungwa.school.service.cms.entity.vo.AdVo;

import java.util.List;

/**
 * <p>
 * 广告推荐 服务类
 * </p>
 *
 * @author Sungwa
 * @since 2020-09-13
 */
public interface AdService extends IService<Ad> {

    IPage<AdVo> selectPage(Long page, Long limit);

    boolean removeAdImageById(String id);

    List<Ad> selectByAdTypeId(String adTypeId);

}

