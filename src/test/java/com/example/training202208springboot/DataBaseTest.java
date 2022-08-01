package com.example.training202208springboot;

import com.example.training202208springboot.data.mapper.entity.UserEntity;
import com.example.training202208springboot.data.mapper.param.UserParams;
import com.example.training202208springboot.domain.repository.UserRepository;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("junit")
class DataBaseTest {
  @Autowired private UserRepository userRepository;

  @Test
  void select() {
    final UserParams params = UserParams.builder().id(1).build();
    final List<UserEntity> userEntityList = userRepository.select(params);
    userEntityList.forEach(userEntity -> System.out.println(userEntity.getName()));
  }

  @Test
  void insert() {
    final UserParams params = UserParams.builder().name("Sato Taro").build();
    userRepository.insert(List.of(params));
  }

  @Test
  void update() {
    final UserParams params = UserParams.builder().id(1).name("Tanaka Taro").build();
    userRepository.update(params);
  }

  @Test
  void delete() {
    final UserParams params = UserParams.builder().id(2).build();
    userRepository.delete(params);
  }
}
