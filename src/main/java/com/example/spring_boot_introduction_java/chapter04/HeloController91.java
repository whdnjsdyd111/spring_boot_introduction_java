package com.example.spring_boot_introduction_java.chapter04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController91 {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index01");
        mav.addObject("val", "please type ...");
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView send(@RequestParam String text1, ModelAndView mav) {
        mav.setViewName("index02");
        mav.addObject("val", "you typed: " + text1 + ".");
        return mav;
    }
}
