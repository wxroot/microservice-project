package cn.wxroot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("server/discover")
public class ServerDiscoverController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/lists")
    public List<String> lists() {

        return discoveryClient.getServices();
    }

    @GetMapping("/{serviceId}")
    public List<ServiceInstance> get(@PathVariable("serviceId")String serviceId) {

        return discoveryClient.getInstances(serviceId);
    }
}
