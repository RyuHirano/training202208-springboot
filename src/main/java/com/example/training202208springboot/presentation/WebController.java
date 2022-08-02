package com.example.training202208springboot.presentation;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebController {
  @GetMapping
  public String index(Model model) {

    model.addAttribute("message", "こんにちは");
    model.addAttribute("style", "background-color:red;");
    model.addAttribute("list", List.of("山田", "田中", "佐藤"));

    return "index";
  }
}
