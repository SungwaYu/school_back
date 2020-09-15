package pers.sungwa.school.service.oss.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author sungwa
 * @date 9/14/20
 */
@Data
@Component
@ConfigurationProperties(prefix = "aliyun.oss")
public class OssProperties {
    private String endpoint;
    private String keyid;
    private String keysecret;
    private String bucketname;
}
