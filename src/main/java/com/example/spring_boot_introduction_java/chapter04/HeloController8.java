package com.example.spring_boot_introduction_java.chapter04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class HeloController8 {
    @RequestMapping("/{tax}")
    public ModelAndView index(@PathVariable int tax, ModelAndView mav) {
        mav.setViewName("index95");
        mav.addObject("tax", tax);
        return mav;
    }
}
