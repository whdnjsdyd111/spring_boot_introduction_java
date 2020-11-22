package com.example.spring_boot_introduction_java.chapter04;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HeloController1 {
    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index7");
        mav.addObject("msg", "message 1<hr/>message 2<br/>message 3");
        return mav;
    }
}
