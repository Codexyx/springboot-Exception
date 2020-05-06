package com.xyx.springbootexceptionandjunit.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * 使用
 *  SimpleMappingExceptionResolver处理异常
 */
//@Configuration
public class GlobalException2 {

    /**
     * 此方法返回值必须是SimpleMappingExceptionResolver
     * @return
     */
//    @Bean
//    public SimpleMappingExceptionResolver exceptionHandler(){
//        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
//        Properties properties = new Properties();
//        /**
//         * properties.put();
//         * 参数一： 异常类型，必须是全名
//         * 参数二： 视图名称，根据不同的异常跳转不同视图
//         */
//        properties.put("java.lang.NullPointerException", "error3");
//        properties.put("java.lang.ArithmeticException", "error4");
//        resolver.setExceptionMappings(properties);
//        return resolver;
//    }

}
