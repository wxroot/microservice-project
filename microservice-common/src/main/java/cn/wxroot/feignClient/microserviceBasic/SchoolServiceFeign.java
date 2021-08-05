package cn.wxroot.feignClient.microserviceBasic;

import cn.wxroot.pojo.SchoolInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@FeignClient(name = "APPLICATION-ZUUL-9000/basic", path = "/school")
public interface SchoolServiceFeign {

    @GetMapping("/{id}")
    SchoolInfo getInfoById(@PathVariable("id") String id);

    @GetMapping("/lists")
    List<SchoolInfo> lists();
}
