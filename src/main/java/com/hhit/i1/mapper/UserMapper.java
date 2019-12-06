package com.hhit.i1.mapper;

import com.hhit.i1.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User findById(Integer id);
    List<User> findAll();
}