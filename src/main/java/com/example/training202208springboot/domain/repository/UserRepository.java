package com.example.training202208springboot.domain.repository;

import com.example.training202208springboot.data.mapper.entity.UserEntity;
import com.example.training202208springboot.data.mapper.param.UserParams;
import java.util.List;

public interface UserRepository {
  List<UserEntity> select(UserParams userParams);

  void insert(List<UserParams> userParamsList);

  void update(UserParams userParams);

  void delete(UserParams userParams);
}
