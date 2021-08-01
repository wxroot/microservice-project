package cn.wxroot.feignClient.microserviceBasic;

import cn.wxroot.pojo.SchoolInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@FeignClient(name = "APPLICATION-BASIC-8001", path = "/school", fallbackFactory = SchoolServiceFeignFallback.class)
public interface SchoolServiceFeign {

    @GetMapping("/lists")
    List<SchoolInfo> lists();
}
