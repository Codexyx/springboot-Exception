package com.xyx.springbootexceptionandjunit.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义 HandlerExceptionResolver 对象处理异常
 * 必须实现 HandlerExceptionResolver 接口，重写他的抽象方法
 */
@Configuration
public class GlobalException3 implements HandlerExceptionResolver{

    /**
     *
     * @param httpServletRequest    此次产生异常的请求对象
     * @param httpServletResponse   此次产生异常的响应对象
     * @param handler
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        //判断不同的异常类型，做不同的视图跳转
        if(e instanceof java.lang.NullPointerException){
            modelAndView.setViewName("error1");
        }else if(e instanceof java.lang.ArithmeticException){
            modelAndView.setViewName("error2");
        }
        modelAndView.addObject("err", e.toString());
        //可加多个判断以此类推
        return modelAndView;
    }
}
