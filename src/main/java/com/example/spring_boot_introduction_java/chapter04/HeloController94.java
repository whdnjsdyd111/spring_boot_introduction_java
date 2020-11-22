package com.example.spring_boot_introduction_java.chapter04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class HeloController94 {

    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index02");
        ArrayList<DataObject> data = new ArrayList<DataObject>();
        data.add(new DataObject(0, "park", "park@yamada"));
        data.add(new DataObject(1, "lee", "lee@flowers"));
        data.add(new DataObject(2, "choi", "choi@happy"));
        mav.addObject("data", data);
        return mav;
    }
}
