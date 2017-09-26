<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>ZK</title>
    <%@ include file="/webpage/include/head.jsp" %>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <!-- Main Header -->
    <header class="main-header">

        <!-- Logo -->
        <a href="#" class="logo" data-toggle="offcanvas">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>ZK</b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>ZhangK</b></span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation" style="height: 50px;background-color: #f2f2f2;padding-left: 1px">
            <div class="navbar-custom-menu" style="float: left;box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .1);">
                <ul class="nav navbar-nav">
                    <!-- User Account Menu -->
                    <li class="dropdown user user-menu site-zk-active layui-this" style="height: 50px; width: 45px;">
                        <!-- Menu Toggle Button -->
                        <a href="${ctx}/user/home" target="menuFrame" style="color: #000;">
                            <i class="fa fa-home"></i>
                        </a>
                    </li>
                </ul>
            </div>

            <div class="layui-tab layui-tab-card" id="tab-title" lay-allowclose="true"
                 style="float: left;width:calc(100% - 137px);position: absolute;margin-left: 45px;" lay-filter="zk-tab">
                <ul class="layui-tab-title" style="margin: 0;">
                </ul>
            </div>

            <!-- Navbar Right Menu -->
            <div class="navbar-custom-menu" style="float: right;box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .1);">
                <ul class="nav navbar-nav">
                    <!-- User Account Menu -->
                    <li class="dropdown user user-menu" style="height: 50px; width: 50px;">
                        <!-- Menu Toggle Button -->
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="height: 50px; width: 50px;">
                            <!-- The user image in the navbar-->
                            <img src="../../static/AdminLTE/dist/img/user2-160x160.jpg" class="user-image"
                                 alt="User Image">
                            <!-- hidden-xs hides the username on small devices so only the image appears. -->
                            <%--<span class="hidden-xs">Alexander Pierce</span>--%>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- The user image in the menu -->
                            <li class="user-header">
                                <img src="../../static/AdminLTE/dist/img/user2-160x160.jpg" class="img-circle"
                                     alt="User Image">
                                <p>
                                    Alexander Pierce - Web Developer
                                    <small>Member since Nov. 2012</small>
                                </p>
                            </li>
                            <!-- Menu Body -->
                            <li class="user-body">
                                <div class="col-xs-4 text-center">
                                    <a href="#">Followers</a>
                                </div>
                                <div class="col-xs-4 text-center">
                                    <a href="#">Sales</a>
                                </div>
                                <div class="col-xs-4 text-center">
                                    <a href="#">Friends</a>
                                </div>
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">个人中心</a>
                                </div>
                                <div class="pull-right">
                                    <a href="/user/logout" class="btn btn-default btn-flat">退出登录</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>

            <div class="navbar-custom-menu" style="float: right;box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .1);">
                <ul class="nav navbar-nav">
                    <li class="dropdown notifications-menu" style="height: 50px; width: 42px;">
                        <!-- Menu Toggle Button -->
                        <a href="#" class="sidebar-toggle" data-toggle="dropdown" role="button" style="color: #333">
                            <span class="sr-only">Toggle navigation</span>
                        </a>
                        <ul class="dropdown-menu" style="width: 50px;text-align: center;">
                            <li>
                                <ul class="menu">
                                    <!-- Menu Body -->
                                    <li>
                                        <a href="#" id="closeAll">关闭全部</a>
                                    </li>
                                    <li>
                                        <a href="#" id="closeOthers">关闭其他</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">

        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar layui-tab">

            <!-- Sidebar Menu -->
            <ul class="sidebar-menu">
                <%--<li class="header">HEADER</li>--%>
                <!-- Optionally, you can add icons to the links -->
                <li class="site-zk-active active" data-type="tabAdd" data-index="1">
                    <a href="${ctx}/user/page1" target="menuFrame">
                        <i class="fa fa-paw"></i>
                        <span>Link</span>
                    </a>
                </li>
                <li class="site-zk-active" data-type="tabAdd" data-index="2">
                    <a href="${ctx}/user/page2" target="menuFrame">
                        <i class="fa fa-paw"></i>
                        <span>Another Link</span>
                    </a>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-paw"></i>
                        <span>Multilevel</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li class="site-zk-active" data-type="tabAdd" data-index="3">
                            <a href="${ctx}/user/page1" target="menuFrame" >
                                <i class="fa fa-circle-o"></i>
                                <span> page1</span>
                            </a>
                        </li>
                        <li class="site-zk-active" data-type="tabAdd" data-index="4">
                            <a href="${ctx}/user/page2" target="menuFrame">
                                <i class="fa fa-circle-o"></i>
                                <span> page2</span>
                            </a>
                        </li>
                    </ul>
                </li>
            </ul><!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <%--<section class="content-header">--%>
            <%--<h1>--%>
                <%--Page Header--%>
                <%--<small>Optional description</small>--%>
            <%--</h1>--%>
            <%--<ol class="breadcrumb">--%>
                <%--<li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>--%>
                <%--<li class="active">Here</li>--%>
            <%--</ol>--%>
        <%--</section>--%>

        <!-- Main content -->
        <section class="content">
            <!-- Your Page Content Here -->
            <iframe id="menuFrame" name="menuFrame" width="100%" height="100%" src="${ctx}/user/home"
                    frameborder="0"></iframe>
        </section><!-- /.content -->
    </div><!-- /.content-wrapper -->

    <!-- Main Footer -->
    <footer class="main-footer">
        <!-- To the right -->
        <div class="pull-right hidden-xs">
            Anything you want
        </div>
        <!-- Default to the left -->
        <strong>Copyright &copy; 2015 <a href="#">Company</a>.</strong> All rights reserved.
    </footer>

    <!-- Add the sidebar's background. This div must be placed
         immediately after the control sidebar -->
    <div class="control-sidebar-bg"></div>
</div><!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 2.1.1 -->
<script src="${ctxStatic}/jquery/jquery-2.1.1.min.js"></script>
<!-- Bootstrap 3.3.5 -->
<script src="${ctxStatic}/bootstrap/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="${ctxStatic}/AdminLTE/dist/js/app.min.js"></script>
<script src="${ctxStatic}/common/contabs.js"></script>
<script src="${ctxStatic}/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    var active;
    layui.use('element', function(){
        var $ = layui.jquery
            ,element = layui.element(); //Tab的切换功能，切换事件监听等，需要依赖element模块

        //触发事件
        var active = {
            tabAdd: function(){
                var dataIndex = $(this).data('index'),
                    flag = true;
                //判断tab是否已经打开
                $('#tab-title ul li').each(function () {
                    if($(this).attr('lay-id') == dataIndex){
                        flag = false;
                    }
                })

                if (flag){
                    //新增一个Tab项
                    element.tabAdd('zk-tab', {
                        title: this.firstElementChild.children[1].innerHTML //用于演示
                        ,id: dataIndex //实际使用一般是规定好的id，这里以时间戳模拟下
                    })
                }

                $('#menuFrame').attr('src', this.firstElementChild.href);
                element.tabChange('zk-tab',dataIndex);
            }
            ,tabChange: function(){
                //切换到指定Tab项
                element.tabChange('zk-tab', '22'); //切换到：用户管理
            }
            ,tabDelete: function(tabId){
                //删除指定Tab项
                element.tabDelete('zk-tab', tabId); //删除：“商品管理”
//                othis.addClass('layui-btn-disabled');
            }
        };

        $('.site-zk-active').on('click', function(){
            var othis = $(this), type = othis.data('type');
            active[type] ? active[type].call(this, othis) : '';
        });

        $('#closeAll').on('click', function () {
            $('#menuFrame').attr('src', '${ctx}/user/home');
            $('#tab-title ul li').each(function () {
                active['tabDelete'].call(this, $(this).attr("lay-id"));
            })
        })

        $('#closeOthers').on('click', function () {
            $('#tab-title ul li').not('.layui-this').each(function () {
                active['tabDelete'].call(this, $(this).attr("lay-id"));
            })
        })


    });

</script>
</body>
</html>
