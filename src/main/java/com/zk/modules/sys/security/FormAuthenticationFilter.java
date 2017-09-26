package com.zk.modules.sys.security;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FormAuthenticationFilter extends org.apache.shiro.web.filter.authc.FormAuthenticationFilter {
    /**
     * 登录成功之后跳转URL
     */
    public String getSuccessUrl() {
        return super.getSuccessUrl();
    }

    @Override
    protected void issueSuccessRedirect(ServletRequest request,
                                        ServletResponse response) throws Exception {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null){
            WebUtils.issueRedirect(request, response, getSuccessUrl(), null, true);
        }
    }

}
