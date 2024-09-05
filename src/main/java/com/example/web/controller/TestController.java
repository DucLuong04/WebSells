package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/home")
    public String toString() {
<<<<<<< HEAD
        String sc = "copu";
=======
        String sc = "";
>>>>>>> master
        return sc;
    }
}
