package cn.wxroot.config;

import cn.wxroot.config.rule.RoundRobinFiveRule;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringMvcConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate (){

        return new RestTemplate();
    }

    @Bean
    public IRule iRule(){

//        return new RoundRobinFiveRule();
        return new RoundRobinRule();
    }

    @Bean
    public ServletRegistrationBean<HystrixMetricsStreamServlet> servletRegistrationBean(){

        return new ServletRegistrationBean<>(new HystrixMetricsStreamServlet(), "/hystrix.stream");
    }
}
