package com.zk.modules.user.dao;

import com.zk.common.persistence.BaseDao;
import com.zk.modules.user.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/4/7.
 */
@Repository
public interface UserDao extends BaseDao<User> {
    public User getByUsername(@Param("username") String username);
}
