package com.example.myproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {
  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("message", "Hello world.");
    return "index";
  }
}
