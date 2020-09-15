package pers.sungwa.school.service.edu.feign.fallback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.service.edu.feign.VodMediaService;

import java.util.List;

/**
 * @author sungwa
 * @date 9/14/20
 */
@Service
@Slf4j
public class VodMediaServiceFallBack implements VodMediaService {
    @Override
    public R removeVideo(String vodId) {
        log.info("熔断保护");
        return R.error();
    }

    @Override
    public R removeVideoByIdList(List<String> videoIdList) {
        log.info("熔断保护");
        return R.error();
    }
}
