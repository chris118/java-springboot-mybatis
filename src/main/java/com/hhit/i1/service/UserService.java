package com.hhit.i1.service;

import com.hhit.i1.bean.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);

    List<User> findAll();
}
