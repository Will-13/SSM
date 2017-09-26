package com.zk.user;

import com.zk.BaseTest;
import com.zk.modules.user.dao.UserDao;
import com.zk.modules.user.entity.User;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/4/7.
 */
public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testGetByLoginName(){
        User user = userDao.getByUsername("admin");
        System.out.println(user);
    }

    @Test
    public void testMd5(){
        // 原始密码
        String source = "admin";
        // 盐
        String salt = "aaa";
        // 散列次数
        int hashIterations = 2;

        Md5Hash md5Hash = new Md5Hash(source, salt, hashIterations);

        String password_md5 = md5Hash.toString();
        System.out.println(password_md5);
        System.out.println(password_md5.length());
    }

    @Test
    public void deviceTest(){
        String userAgent = "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Mobile/14E277 MicroMessenger/6.5.14 NetType/WIFI Language/zh_CN";
        String[] str=userAgent.split("[()]+");
        String res="iphone"+str[1].split("OS")[1].split("like")[0];
        System.out.println(res);
    }
}
