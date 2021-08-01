package cn.wxroot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //启用服务发现（即可被查询服务信息）
@EnableFeignClients
@EnableCircuitBreaker
public class MicroserviceConsumer8080Application {

    public static void main(String[] args) {

        SpringApplication.run(MicroserviceConsumer8080Application.class, args);
    }
}
