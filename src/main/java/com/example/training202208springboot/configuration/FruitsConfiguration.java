package com.example.training202208springboot.configuration;

import java.util.List;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(value = "fruits")
public class FruitsConfiguration {
  private String name;
  private List<Integer> price;
}
