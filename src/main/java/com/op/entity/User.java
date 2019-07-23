package com.op.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Jue-PC
 */
@Getter
@Setter
@ToString
public class User {
    private String uid;
    private String upwd;
    private String uname;
    private String uphone;
    private String uaddress;
    private String rid;
}
