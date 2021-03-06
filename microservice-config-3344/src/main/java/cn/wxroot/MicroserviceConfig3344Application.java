package cn.wxroot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceConfig3344Application {

    public static void main(String[] args) {

        SpringApplication.run(MicroserviceConfig3344Application.class, args);
    }
}
