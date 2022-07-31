package com.example.training202208springboot.data.mapper;

import com.example.training202208springboot.data.mapper.entity.UserEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
  List<UserEntity> select();
}
