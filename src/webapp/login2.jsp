<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">

<script type="text/javascript">
    function login() {
        //注意需要将password先encode成url形式以避免特殊字符出错
        var account = document.getElementById("account").value;
        var password = encodeURIComponent(document.getElementById("password").value);

        if (account == "" || password == "") {
            if (account == "") {
                document.getElementById("account").value = "";
                document.getElementById("account").placeholder = "请输入您的账号";
                document.getElementById("account").setAttribute('class', 'tel_input change');
            }
            if (password == "") {
                document.getElementById("password").value = "";
                document.getElementById("password").placeholder = "请输入您的密码";
                document.getElementById("password").setAttribute('class', 'tel_input change');
            }
            return;
        }

        if (window.XMLHttpRequest) {
            // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
            xmlhttp = new XMLHttpRequest();
        } else {
            // IE6, IE5 浏览器执行代码
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                var loginResult = xmlhttp.responseText;
                if (loginResult == 'no such user') {
                    alert("您的账号或密码有误，请检查后重新输入!!");
                    return;
                }
                //else if(loginResult=='DengLuChengGong'){
                else {
                    //window.location.href="http://localhost:8081?backurl="+window.location.href;
                    //window.location.href="http://114.116.22.79:8080/front/#/entrance?backurl="+window.location.href;
                    //window.location.href="http://114.116.22.79:8080/front/#/entrance?account="+account+"&password="+password;
                    //window.location.href="http://localhost:8080/front/#/entrance";
                    //window.location.href="http://192.168.189.157:8503/front/#/entrance";
                    window.location.href = "http://114.116.22.79:8080/front/#/entrance";
                    return;
                }
                //else{
                //	alert("系统故障了!!");
                //	return ;
                //}
            }
        }
        xmlhttp.open("GET", "/tiesheyuan/rbac/login?account=" + account + "&password=" + password, true);
        xmlhttp.send();
    }
</script>

<head>
    <!-- 禁止一切方式回退到当前界面 -->
    <!-- 	<script language="JavaScript">javascript:window.history.forward(1);</script> -->
    <meta charset="UTF-8">
    <title>铁路工程地质勘察中心数据库系统</title>
    <style type="text/css">
        .tel_input.change::-webkit-input-placeholder {
            font-family: monospace;
            font-weight: bolder;
            color: #ff2f00;
            font-size: 0.2rem;
        }

        .tel_input.change::-moz-placeholder {
            font-family: monospace;
            font-weight: bolder;
            color: #ff2f00;
            font-size: 0.2rem;
        }

        .tel_input.change::-ms-input-placeholder {
            font-family: monospace;
            font-weight: bolder;
            color: #ff2f00;
            font-size: 0.2rem;
        }
    </style>

    <link rel="stylesheet" href="assets/css/login_css/index.css">
    <script type="text/javascript" src="assets/js/login_js/jquery.js"></script>
</head>

<body>

<script>
    $(document).ready(function () {
        var whei = $(window).width()
        $("html").css({fontSize: whei / 19.3});
        $(window).resize(function () {
            var whei = $(window).width();
            $("html").css({fontSize: whei / 19.3})
        });
    });
</script>

<div class="main">

    <div class="header">
        <div class="header-center fl">
            <div class="header-title">
                铁路工程地质勘察中心数据库系统
            </div>
            <div class="header-img"></div>
        </div>
        <div class="header-bottom fl"></div>
    </div>

    <div class="content">
        <div class="content-left">
            <!--<img src="images/login/d.png" alt="">-->
        </div>
        <div class="content-right">
            <div class="right-infp">

                <!--             大量的二进制数据时enctype="multipart/form-data" -->
                <!--             	<form method="post" action="/JavaEE/QueryServlet" enctype="multipart/form-data"> -->

                <!-- 				如下是默认情况下的enctype -->


                <div class="right-infp-name">
                    <input type="text" id="account" name="account" placeholder="请输入账号" autocomplete="off" required>
                </div>
                <div class="right-infp-name">
                    <input type="password" id="password" name="password" placeholder="请输入密码" autocomplete="off"
                           required>
                </div>

                <div class="right-infp-btn">
                    <button class="btn" onclick="login()">登录</button>
                </div>

                <div class="refind-password">
                    <a href="refindPassword.jsp">找回密码</a>
                </div>
                <div class="register-now">
                    <a href="register.jsp">立即注册</a>
                </div>

            </div>
        </div>
    </div>
</div>


</body>
</html>