package com.example.homework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class launch {
    @GetMapping("/")
    public String applicationLaunch() {
        return "Приложение запущено.";
    }

    @GetMapping("/info")
    public String info() {
        return "Марина, домашня работа, 14.12.2022 г., изучение Maven и Framework";
    }
}

//public class launchController() {
//    @GetMapping("/")
//    public String applicationLaunch() {
//        return "Приложение запущено.";
//    }
//}

//    @GetMapping("/path/to/page")
//    public String page(@RequestParam String page) {
//        return "Page: " + page;
//    }