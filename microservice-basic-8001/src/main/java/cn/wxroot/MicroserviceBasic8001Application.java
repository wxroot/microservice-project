package cn.wxroot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("cn.wxroot.dao")
@EnableEurekaClient
public class MicroserviceBasic8001Application {

    public static void main(String[] args) {

        SpringApplication.run(MicroserviceBasic8001Application.class, args);
    }
}
