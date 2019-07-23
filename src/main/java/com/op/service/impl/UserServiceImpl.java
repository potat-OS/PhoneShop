package com.op.service.impl;

import com.op.dao.UserMapper;
import com.op.entity.User;
import com.op.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jue-PC
 */
@Service
public class UserServiceImpl implements UserService {

    private final
    UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {this.userMapper = userMapper;}

    @Override
    public User findUser(String uid) {
        return userMapper.findUser(uid);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
