package cn.wxroot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class MicroserviceZuul9000Application {

    public static void main(String[] args) {

        SpringApplication.run(MicroserviceZuul9000Application.class, args);
    }
}
