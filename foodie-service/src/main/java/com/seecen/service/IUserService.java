package com.seecen.service;

import com.seecen.pojo.Users;
import com.seecen.pojo.bo.UserBO;

public interface IUserService {

    /**
     * 判断用户名是否存在
     */
    boolean queryUsernameIsExist(String username);

    /**
     * 判断用户名是否存在
     */
    Users createUser(UserBO userBO);

    /**
     * 检索用户名和密码是否匹配，用于登录
     */
    Users queryUserForLogin(String username, String password);
}
