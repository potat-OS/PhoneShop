package com.op.dao;

import com.op.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author Jue-PC
 */
@Repository
public interface UserMapper {


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
