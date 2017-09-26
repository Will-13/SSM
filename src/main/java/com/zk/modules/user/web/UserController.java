package com.zk.modules.user.web;

import com.zk.common.utils.DeviceUtils;
import com.zk.modules.user.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/4/7.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(String username, String password){
        return "modules/index";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginFail(HttpServletRequest request){
        //如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        if(StringUtils.isNotBlank(exceptionClassName)){
            return "modules/index";
        }
        return "modules/sysIndex";
    }

    @RequestMapping("deviceTest")
    public void deviceTest(HttpServletRequest request){
        System.out.println(DeviceUtils.isIOSDevice(request));
        System.out.println(DeviceUtils.isMobileDevice(request));
        System.out.println(DeviceUtils.isWeChat(request));
    }

    @RequestMapping("page1")
    @RequiresPermissions("page1:list")
    public String page1(HttpServletRequest request){
        return "modules/page1";
    }

    @RequestMapping("page2")
    public String page2(){
        return "modules/page2";
    }

    @RequestMapping("home")
    public String home(){
        return "modules/home";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        SecurityUtils.getSubject().logout();
        return "modules/index";
    }

    @RequestMapping("sysIndex")
    public String sysIndex(){
        return "modules/sysIndex";
    }

    @ResponseBody
    @RequestMapping("test")
    public String test(){
        return "ok";
    }
}
