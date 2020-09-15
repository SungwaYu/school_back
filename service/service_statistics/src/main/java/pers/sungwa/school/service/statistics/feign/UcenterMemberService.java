package pers.sungwa.school.service.statistics.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.service.statistics.feign.fallback.UcenterMemberServiceFallBack;

/**
 * @author sungwa
 * @date 9/15/20
 */
@Service
@FeignClient(value = "service-ucenter", fallback = UcenterMemberServiceFallBack.class)
public interface UcenterMemberService {

    @GetMapping("/admin/ucenter/member/count-register-num/{day}")
    R countRegisterNum(@PathVariable("day") String day);
}
