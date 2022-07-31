package com.example.training202208springboot.data.repository;

import com.example.training202208springboot.data.mapper.UserMapper;
import com.example.training202208springboot.data.mapper.entity.UserEntity;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepository {
  private final UserMapper userMapper;

  public List<UserEntity> select() {
    return userMapper.select();
  }
}
