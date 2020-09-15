package pers.sungwa.school.service.statistics.feign.fallback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.service.statistics.feign.UcenterMemberService;

/**
 * @author sungwa
 * @date 9/15/20
 */
@Service
@Slf4j
public class UcenterMemberServiceFallBack implements UcenterMemberService {

    @Override
    public R countRegisterNum(String day) {
        log.error("熔断被执行");
        return R.ok().data("registerNum", 0);
    }
}