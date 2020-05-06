package com.xyx.springbootexceptionandjunit.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理器
 */

//@ControllerAdvice
public class GlobalException {

    /**
     * 这个方法用于处理NullPointerException异常
     * 注入的 Exception e添加到ModelAndView对象中
     * 然后ModelAndView对象会根据不同的异常跳转到不同的错误页面
     * @param e
     * @return
     */
//    @ExceptionHandler(value = {java.lang.NullPointerException.class})
//    public ModelAndView nullpointExceptionHandler(Exception e){
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("err", e.toString());
//        mv.setViewName("error1");
//        return mv;
//    }
//
//    //处理算数异常
//    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
//    public ModelAndView arithmeticExceptionHandler(Exception e){
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("err", e.toString());
//        mv.setViewName("error1");
//        return mv;
//    }
}
