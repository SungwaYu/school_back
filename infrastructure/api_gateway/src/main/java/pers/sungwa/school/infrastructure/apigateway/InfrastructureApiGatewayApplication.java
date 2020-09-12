package pers.sungwa.school.infrastructure.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sungwa
 * @date 9/12/2020
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class InfrastructureApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfrastructureApiGatewayApplication.class, args);
    }
}