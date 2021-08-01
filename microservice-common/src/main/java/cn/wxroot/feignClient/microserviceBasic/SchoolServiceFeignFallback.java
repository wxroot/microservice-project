package cn.wxroot.feignClient.microserviceBasic;

import cn.wxroot.pojo.SchoolInfo;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SchoolServiceFeignFallback implements FallbackFactory<SchoolServiceFeign> {

    private final Logger logger = LoggerFactory.getLogger(SchoolServiceFeignFallback.class);

    @Override
    public SchoolServiceFeign create(Throwable throwable) {

        return () -> {

            logger.warn("SchoolServiceFeign_lists fallback");

            return new ArrayList<>();
        };
    }
}
