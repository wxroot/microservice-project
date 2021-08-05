package cn.wxroot.controller;

import cn.wxroot.feignClient.microserviceBasic.SchoolServiceFeign;
import cn.wxroot.pojo.SchoolInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

//    final String URL_PREFIX = "http://";
//    final String SERVER_BASIC = "APPLICATION-BASIC-8001";
//    @Autowired
//    private RestTemplate restTemplate;
//        String url = URL_PREFIX + SERVER_BASIC + "/school/lists";
//        return restTemplate.getForObject(url, List.class);

    @Autowired
    private SchoolServiceFeign schoolFeignService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/school/{id}")
    public SchoolInfo getInfoById(@PathVariable("id") String id) {

        return schoolFeignService.getInfoById(id);
    }

    @GetMapping("/school/lists")
    public List schoolLists() {

        return schoolFeignService.lists();
    }

    @GetMapping("/lists")
    public List<String> lists() {

        return discoveryClient.getServices();
    }

    @GetMapping("/{serviceId}")
    public List<ServiceInstance> get(@PathVariable("serviceId") String serviceId) {

        return discoveryClient.getInstances(serviceId);
    }
}
