package com.zk.modules.user.service;

import com.zk.common.persistence.BaseService;
import com.zk.modules.user.dao.UserDao;
import com.zk.modules.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */
@Service
public class UserService implements BaseService<User> {
    @Autowired
    private UserDao userDao;

    @Override
    public User getByPrimaryKey() {
        return null;
    }

    @Override
    public List<User> getList() {
        return null;
    }

    public User getByUsername(String loginName){
        return userDao.getByUsername(loginName);
    }


}
