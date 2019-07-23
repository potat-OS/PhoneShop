package com.op.service;

import com.op.entity.User;

/**
 * @author Jue-PC
 */
public interface UserService {
    /**
     * find user by id
     *
     * @param uid
     * @return
     */
    User findUser(String uid);

    /**
     * insert user
     *
     * @param user
     */
    void insertUser(User user);

}
