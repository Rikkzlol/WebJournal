package com.rikkz.WebJournal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JournalController {

    @GetMapping("/blog")
    public String blogMain(Model model) {
        return "blog-main";
    }
}
