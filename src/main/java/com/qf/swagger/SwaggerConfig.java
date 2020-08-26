package com.qf.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Administrator
 * @version 1.0 2020/8/12 0012 上午 10:49
 */

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createDocket() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("wk")
                .enable(true)//enable表示是否开启Swagger
                .select()//RequestHandlerSelectors指定扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.qf.controller"))
                .build();
    }
    //配置API的基本信息（会在http://项目实际地址/swagger-ui.html页面显示）
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测试API文档标题")
                .description("测试api接口文档描述")
                .termsOfServiceUrl("http://www.baidu.com")
                .version("1.0")
                .build();
    }

    public Docket docket(){

        return null;
    }

}
