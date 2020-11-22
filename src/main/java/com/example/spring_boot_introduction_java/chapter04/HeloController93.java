package com.example.spring_boot_introduction_java.chapter04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController93 {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index02");
        mav.addObject("msg", "type a number ...");
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView send(@RequestParam int num, ModelAndView mav) {
        mav.setViewName("index02");
        int total = 0;
        for(int i = 1; i <= num; i++)
            total += i;
        mav.addObject("msg", "total: " + total + "!!");
        return mav;
    }
}
