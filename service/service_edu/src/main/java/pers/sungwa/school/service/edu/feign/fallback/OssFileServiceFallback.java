package pers.sungwa.school.service.edu.feign.fallback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.service.edu.feign.OssFileService;

/**
 * @author sungwa
 * @date 9/14/20
 */
@Service
@Slf4j
public class OssFileServiceFallback implements OssFileService {

    @Override
    public R test() {
        return R.error();
    }

    @Override
    public R removeFile(String url) {
        log.info("熔断保护");
        return R.error();
    }
}