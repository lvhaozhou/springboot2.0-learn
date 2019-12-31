package com.lhz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: lhz
 * @Date: 2019/12/26 0026 16:34
 * @Description: HelloWorldController
 * @Version: 1.0
 */
@Controller
public class HelloWorldController {

    @RequestMapping("")
    public String index(@RequestParam int value, /*@CookieValue("JSESSIONID")String jsessionid,*/ Model model) {

        /*model.addAttribute("jsessionid", jsessionid);*/
        return "index";
    }
}
