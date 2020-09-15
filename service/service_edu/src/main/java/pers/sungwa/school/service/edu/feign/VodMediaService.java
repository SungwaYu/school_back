package pers.sungwa.school.service.edu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.service.edu.feign.fallback.VodMediaServiceFallBack;

import java.util.List;

/**
 * @author sungwa
 * @date 9/14/20
 */
@Service
@FeignClient(value = "service-vod", fallback = VodMediaServiceFallBack.class)
public interface VodMediaService {

    @DeleteMapping("/admin/vod/media/remove/{vodId}")
    R removeVideo(@PathVariable("vodId") String vodId);

    @DeleteMapping("/admin/vod/media/remove")
    R removeVideoByIdList(@RequestBody List<String> videoIdList);
}
