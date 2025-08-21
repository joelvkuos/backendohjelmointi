package com.example.viikko1johdanto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class MyController {
    @RequestMapping("/main")
    @ResponseBody
    public String requestString(
            @RequestParam(name = "nimesi", required = false, defaultValue = "John") String etunimi,
            @RequestParam(name = "location", required = false, defaultValue = "Moon") String location) {
        return "Welcome to the " + location + " " + etunimi + "!";
    }

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "This is the main page";

    }

    @RequestMapping("contact")
    @ResponseBody
    public String contact() {
        return "This is the contact page";

    }

}
