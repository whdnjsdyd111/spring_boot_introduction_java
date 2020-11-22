package com.example.spring_boot_introduction_java.chapter04;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HeloController {
    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index4");
        mav.addObject("msg", "current data.");
        DataObject obj = new DataObject(123, "lee", "lee@flower");
        mav.addObject("object", obj);
        return mav;
    }
}

class DataObject {
    private int id;
    private String name;
    private String value;

    public DataObject(int id, String name, String value) {
        super();
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
