package com.example.spring_boot_introduction_java.chapter04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController9 {
    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index96");
        return mav;
    }
}
