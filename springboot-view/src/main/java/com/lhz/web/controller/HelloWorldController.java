package com.lhz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: lhz
 * @Date: 2019/12/30 0030 13:42
 * @Description: HelloWorldController
 * @Version: 1.0
 */
@Controller
public class HelloWorldController {

    @RequestMapping("")
    public String index(@RequestParam(required = false, defaultValue = "0") int value, @CookieValue(value = "JSESSIONID", required = false)String jsessionid, Model model) {
        model.addAttribute("jsessionid", jsessionid);
        return "index";
    }

    @RequestMapping("hello-world")
    public String helloWord(){
        return "hello-world";
    }

    @ModelAttribute("message")
    public String message() {
        return "helloWorld";
    }
}
