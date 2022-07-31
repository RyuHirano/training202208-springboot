package com.example.training202208springboot;

import com.example.training202208springboot.data.mapper.entity.UserEntity;
import com.example.training202208springboot.data.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("junit")
class DataBaseTest {
  @Autowired private UserRepository userRepository;

  @Test
  void test() {
    final UserEntity entity = userRepository.select().get(0);
    System.out.println(entity.getName());
  }
}
