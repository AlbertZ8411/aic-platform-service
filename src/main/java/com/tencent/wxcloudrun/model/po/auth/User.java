package com.tencent.wxcloudrun.model.po.auth;

import lombok.Data;


/**
 * @author zhualbert
 * @version 1.0
 */
@Data
public class User {

    private Integer id;

    private String bId;

    private String username;

    private String firstName;

    private String lastName;

    private String creator;

    private String createdDate;

    private String updatedDate;

    private String updater;

    private String phoneNo;

    private String email;

    private String code;

    private String avatarBId;
}
