package com.example.spring_boot_introduction_java.chapter03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeloController3 {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
