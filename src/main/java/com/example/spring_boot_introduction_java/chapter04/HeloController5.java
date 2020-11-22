package com.example.spring_boot_introduction_java.chapter04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class HeloController5 {
    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) {
        ArrayList<String[]> data = new ArrayList<>();
        data.add(new String[]{"park", "parkyamada", "909-999-999"});
        data.add(new String[]{"lee", "lee@flower", "080-888-888"});
        data.add(new String[] {"choi", "choi@happy", "080-888-888"});
        mav.addObject("data", data);
        return mav;
    }
}
