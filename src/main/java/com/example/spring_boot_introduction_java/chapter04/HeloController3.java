package com.example.spring_boot_introduction_java.chapter04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController3 {
    @RequestMapping("/{id}")
    public ModelAndView index(@PathVariable int id, ModelAndView mav) {
        mav.setViewName("index9");
        mav.addObject("id", id);
        mav.addObject("check", id >= 0);
        mav.addObject("trueVal", "POSITIVE!");
        mav.addObject("falseVal", "negative...");
        return mav;
    }
}
