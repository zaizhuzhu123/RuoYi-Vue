//package com.laien.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.web.context.request.async.DeferredResult;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
//
//@Configuration
//@EnableSwagger2WebMvc
//public class Knife4jConfiguration {
//
//    @Bean(value = "group110")
//    @Order(1)
//    public Docket group110() {
//        Docket docket = new Docket(DocumentationType.SWAGGER_2)
//                //分组名称
//                .select()
//                //这里指定Controller扫描包路径
//                .apis(RequestHandlerSelectors.basePackage("com.laien.*.controller.c"))
//                .paths(PathSelectors.any())
//                .build();
//        docket.genericModelSubstitutes(DeferredResult.class);
//        return docket;
//    }
//}
