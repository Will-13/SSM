package com.zk.modules.sys.security;

import com.zk.modules.sys.entity.ActiveUser;
import com.zk.modules.user.entity.User;
import com.zk.modules.user.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/12.
 */
public class SystemAuthorizingRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    // 设置realm的名称
    @Override
    public void setName(String name) {
        super.setName("myRealm");
    }

    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // token是用户输入的用户名和密码
        // 第一步：从token中取出用户名
        String username = (String) token.getPrincipal();

        // 第二部：根据用户输入的userCodecong从数据库查询
        User user = null;
        try {
            user = userService.getByUsername(username);
        } catch (Exception e){
            e.printStackTrace();
        }

        // 如果查询不到fanhuinull
        if(user == null){
            return null;
        }

        // 从数据库查询到的密码
        String password = user.getPassword();
        // 盐
        String salt = "aaa";

        // 如果查询到就返回认证信息AuthenticationInfo
        ActiveUser activeUser = new ActiveUser();

        activeUser.setUsercode(user.getUsername());
        activeUser.setUserid(user.getId());

        // 将activeUser设置simpleAuthenticationInfo
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                activeUser,
                password,
                ByteSource.Util.bytes(salt),
                this.getName());

        return simpleAuthenticationInfo;
    }

    /**
     * 授权
     * @param principals
     * @return
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // 从principals获取主身份信息
        // 将getPrimaryPrincipal方法返回值转为真实身份类型
        ActiveUser activeUser =  (ActiveUser) principals.getPrimaryPrincipal();

        // 根据身份信息获取权限信息
        // 从数据库获取到权限数据

        // 单独定一个集合对象
        List<String> permissions = new ArrayList<String>();
        permissions.add("page1:list");

        // 查到权限数据，返回授权信息(要包括 上边的permissions)
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        // 将上边查询到授权信息填充到simpleAuthorizationInfo对象中
        simpleAuthorizationInfo.addStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }

}
