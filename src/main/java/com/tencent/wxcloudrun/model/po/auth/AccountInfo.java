package com.tencent.wxcloudrun.model.po.auth;

import lombok.Data;

@Data
public class AccountInfo {

    private Integer id;

    /**
     * business id of user
     */
    private String userBId;

    private Integer authStatus;

    private Integer authType;

    /**
     *
     * auth id from third party or user input
     * */
    private String authId;
}
