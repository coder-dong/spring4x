package com.smart.dynamic;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by coding-dong on 2018/6/10.
 */
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }
}
