package pers.sungwa.school.service.cms.service;

import pers.sungwa.school.service.cms.entity.Ad;
import com.baomidou.mybatisplus.extension.service.IService;

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

    List<Ad> selectByAdTypeId(String adTypeId);
}
