package com.ruoyi.web.core.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

import java.util.Arrays;

/**
 * note:
 *
 * @author qmf
 */
@Configuration
public class MyWebMvcConfig {

    @Bean
    /**
     * 这里必须添加content-length相应头 否则 server.compression.minResponseSize 不会生效
     */
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterBean = new FilterRegistrationBean();
        filterBean.setFilter(new ShallowEtagHeaderFilter());
        filterBean.setUrlPatterns(Arrays.asList("*"));
        return filterBean;
    }
}
