package com.example.spring_boot_introduction_java.chapter04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController92 {

    @RequestMapping(value = "/")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index01");
        return mav;
    }
}
