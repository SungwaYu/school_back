package pers.sungwa.school.service.vod.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author sungwa
 * @date 9/14/20
 */
@Data
@Component
@ConfigurationProperties(prefix="aliyun.vod")
public class VodProperties {
    private String keyid;
    private String keysecret;
    private String templateGroupId;
    private String workflowId;
}
