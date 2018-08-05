package com.smart.advisor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

/**
 * Created by coding-dong on 2018/6/28.
 */
public class UserService {

    private Logger logger = LoggerFactory.getLogger(UserService.class);

    public int addUser(String userName, int age, boolean sex){
        logger.info("add user success, userName : {}, int age : {}, sex : {}", userName, age, sex);

        return 1;
    }

    public boolean delUser(String userName){
        logger.info("del user success, userName : {}", userName);

        return true;
    }

    public List<String> findUser(String userName){
        logger.info("find users , userName : {}", userName);

        return Collections.emptyList();
    }
}
