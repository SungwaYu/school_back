package pers.sungwa.school.service.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author sungwa
 * @date 9/13/20 5:13 PM
 */
@SpringBootApplication
@ComponentScan({"pers.sungwa.school"})
@EnableFeignClients
public class ServiceCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCmsApplication.class, args);
    }

}