package com.pheiot.phecloud.config;

import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 设置默认MDC KEY VALUE
 *
 * @Author Peter Li
 * @Description
 **/
@Component
@Order(1)
public class LogMdc {
    public LogMdc() {
        MDC.put("log_type", "LOG");
    }

}

