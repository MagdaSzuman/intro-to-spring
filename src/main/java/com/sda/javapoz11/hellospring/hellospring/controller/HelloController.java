package com.sda.javapoz11.hellospring.hellospring.controller;

import com.sda.javapoz11.hellospring.hellospring.service.RandomGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloController {

    //@Qualifier("bigNumbersGenerator") // mówi Springowi jaka ma być nazwa wstrzykiwanego pola
    @Autowired // mówi Springowi, aby w to pole wstrzyknąć pole (bean) - stosować tylko na konstruktorach
    private RandomGenerator randomGenerator;

    @Autowired
    private List<RandomGenerator> randomGeneratorList;

    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView("hello.html");
        modelAndView.addObject("message","Magda nie ma kota :P");
        return modelAndView;
    }
}
