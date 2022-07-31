package com.example.training202208springboot.presentation;

import com.example.training202208springboot.configuration.FruitsConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class RestApiController {
  private final FruitsConfiguration fruitsConfiguration;

  @Value("${fruits.name:orange}")
  private String fruitsName;

  @GetMapping("get")
  public String get() {
    return fruitsName;
  }
}
