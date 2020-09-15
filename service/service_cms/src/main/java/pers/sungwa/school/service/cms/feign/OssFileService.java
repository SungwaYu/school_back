package pers.sungwa.school.service.cms.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.service.cms.feign.fallback.OssFileServiceFallBack;

/**
 * @author sungwa
 * @date 9/14/20
 */
@Service
@FeignClient(value = "service-oss", fallback = OssFileServiceFallBack.class)
public interface OssFileService {

    @DeleteMapping("/admin/oss/file/remove")
    R removeFile(@RequestBody String url);
}