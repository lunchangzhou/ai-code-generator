package com.lcz.aicodegenerator.model.dto.request;


import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author 1onetw
 * @version 1.0
 * @Description: 用户注册请求体
 */
@Data
public class UserRegisterRequest implements Serializable {


    @Serial
    private static final long serialVersionUID = 2034585658608369041L;
    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 校验密码
     */
    private String checkPassword;

}
