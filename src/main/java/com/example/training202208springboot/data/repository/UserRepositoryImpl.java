package com.example.training202208springboot.data.repository;

import com.example.training202208springboot.data.mapper.UserMapper;
import com.example.training202208springboot.data.mapper.entity.UserEntity;
import com.example.training202208springboot.data.mapper.param.UserParams;
import com.example.training202208springboot.domain.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {
  private final UserMapper userMapper;

  @Override
  public List<UserEntity> select(UserParams userParams) {
    return userMapper.select(userParams);
  }

  @Override
  public void insert(List<UserParams> userParamsList) {
    userMapper.insert(userParamsList);
  }

  @Override
  public void update(UserParams userParams) {
    userMapper.update(userParams);
  }

  @Override
  public void delete(UserParams userParams) {
    userMapper.delete(userParams);
  }
}
