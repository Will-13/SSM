<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/taglib.jsp"%>
<html>
<head>
    <meta charset="utf-8" />
    <title>登录</title>
</head>
<link href="${ctxStatic}/login/css/login.css" type="text/css" rel="stylesheet"/>
<script src="${ctxStatic}/jquery/jquery-2.1.1.min.js"></script>
<body>
<div class="cont">
    <div class="form sign-in">
        <form action="/user/login" method="post">
            <h2>欢迎回来,</h2>
            <label>
                <input type="text" id="username" name="username" placeholder="请输入帐号"/>
            </label>
            <label>
                <input type="password" id="password" name="password" placeholder="请输入密码"/>
            </label>
            <button type="submit" class="submit">登录</button>
            <button type="button" class="fb-btn">忘记密码</button>
        </form>
    </div>
    <div class="sub-cont">
        <div class="img">
            <div class="img__text m--up">
                <h2>新用户?</h2>
                <p>赶快加入我们吧!</p>
            </div>
            <div class="img__text m--in">
                <h2>已有账号?</h2>
                <p>如果你已经有账号,请直接登录,我们不会忘记你的!</p>
            </div>
            <div class="img__btn">
                <span class="m--up">注册</span>
                <span class="m--in">登录</span>
            </div>
        </div>
        <div class="form sign-up">
            <h2>宾至如归,</h2>
            <label>
                <span>帐号</span>
                <input type="text" />
            </label>
            <label>
                <span>密码</span>
                <input type="password" />
            </label>
            <label>
                <span>重复密码</span>
                <input type="password" />
            </label>
            <button type="button" class="submit">注册</button>
            <button type="button" class="fb-btn">忘记密码</button>
        </div>
    </div>
</div>

<script type="text/javascript">
    document.querySelector('.img__btn').addEventListener('click', function() {
        document.querySelector('.cont').classList.toggle('s--signup');
    });
</script>
</body>
</html>