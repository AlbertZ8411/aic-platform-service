package com.tencent.wxcloudrun.model.po.auth;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;


/**
 * @author zhualbert
 * @version 1.0
 */
@Data
public class AuthThirdParty {

    private Integer id;

    private String userBId;

    private String accessString;

    private Timestamp accessExpired;

    private Integer authType;

}
