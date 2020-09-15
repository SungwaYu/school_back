package pers.sungwa.school.service.edu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.service.edu.feign.fallback.OssFileServiceFallback;

/**
 * @author sungwa
 * @date 9/14/20
 */
@Service
@FeignClient(value="service-oss",fallback= OssFileServiceFallback.class)
public interface OssFileService {

    @GetMapping("/admin/oss/file/test")
    R test();

    @DeleteMapping("/admin/oss/file/remove")
    R removeFile(@RequestBody String url);
}
