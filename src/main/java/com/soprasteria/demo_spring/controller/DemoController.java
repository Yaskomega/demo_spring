package com.soprasteria.demo_spring.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;


//https://spring.io/guides/gs/serving-web-content/


@Controller
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

//    @GetMapping("/")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "index";
//    }

}
