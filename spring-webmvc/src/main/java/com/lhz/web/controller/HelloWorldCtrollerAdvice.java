package com.lhz.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @Auther: lhz
 * @Date: 2019/12/27 0027 17:21
 * @Description: HelloWorldCtrollerAdvice
 * @Version: 1.0
 */
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldCtrollerAdvice {
    @ModelAttribute("language")
    public String language(@RequestHeader("Accept-Language") String language) {
        return language;
    }

    @ModelAttribute("message")
    public String lhz() {
        return "lhz";
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> onException(Throwable e){
        return ResponseEntity.ok(e.getMessage());
    }
}
