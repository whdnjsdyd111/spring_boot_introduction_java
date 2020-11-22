package com.example.spring_boot_introduction_java.chapter03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController6 {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index2");
        mav.addObject("msg", "이름을 적어서 전송해주세요.");
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView send(@RequestParam("text1") String str, ModelAndView mav) {
        mav.addObject("msg", "안녕하세요! " + str + "님!");
        mav.addObject("value", str);
        mav.setViewName("index2");
        return mav;
    }
}
