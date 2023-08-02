<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<script type="text/javascript">
function sendVerifyCode(){
	var email = document.getElementById("email").value ;
	
	if (email==""){
		document.getElementById("email").value="" ;
		document.getElementById("email").placeholder="请输入您的电子邮箱";
		document.getElementById("email").setAttribute('class', 'tel_input change');
		return;
	}
        
    if (window.XMLHttpRequest)
    {
        // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
        xmlhttp=new XMLHttpRequest();
    }
    else
    {
        // IE6, IE5 浏览器执行代码
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=function()
    {
        if (xmlhttp.readyState==4 &amp;&amp; xmlhttp.status==200)
        {
        	var sendVerifyCodeResult = xmlhttp.responseText;
        	if(sendVerifyCodeResult=='GaiDianZiYouXiangShangWeiBeiZhuCe'){
        		alert("在数据库系统中未匹配到该电子邮箱，请检查您的输入是否有误");
        		document.getElementById("email").value="" ;
        		document.getElementById("email").placeholder="该电子邮箱尚未被注册";
        		document.getElementById("email").setAttribute('class', 'tel_input change');
        		return ;
        	}
        	else if(sendVerifyCodeResult=='YiJiangYanZhengMaFaSongZhiDianZiYouXiang'){
        		alert("已将验证码发送至您的电子邮箱，请注意查收!!");
        		return ;
        	}
        	else if(sendVerifyCodeResult=='QingBuYaoPinFanFaSongYanZhengMa'){
        		alert("请勿频繁向邮箱发送二维码。若没有收到，请稍等45-60秒重新点击发送。");
        		return ;
        	}
        	else{
        		alert("系统故障了!!");
        		return ;
        	}
        }
    }
    xmlhttp.open("GET","/tiesheyuan/rbac/send_verify_code?email="+email,true);
    xmlhttp.send();
}

function isPasswordLegal(){
	document.getElementById("confirmPassword").value="" ;
	var password = document.getElementById("password").value;
	var pwdRegex = new RegExp('^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).{15,30}$');
	
	if(!pwdRegex.test(password)) {
		document.getElementById("password").value="" ;
		if(password.length &lt; 15 || password.length > 30)
			document.getElementById("password").placeholder="密码长度应在15-30位" ;
		else
			document.getElementById("password").placeholder="需包含数字、字母和字符" ;
		document.getElementById("password").setAttribute('class', 'tel_input change');
	}
}
function isConfirmPasswordRight(){
	var password = document.getElementById("password").value;
	var confirmPassword = document.getElementById("confirmPassword").value;
	
	if(confirmPassword!=password) {
		document.getElementById("confirmPassword").value="" ;
		document.getElementById("confirmPassword").placeholder="密码请保持一致" ;
		document.getElementById("confirmPassword").setAttribute('class', 'tel_input change');
	}
}

function refindPassword(){
	var email = document.getElementById("email").value ;
	var verifyCode = document.getElementById("verifyCode").value ;
	var password = encodeURIComponent(document.getElementById("password").value); 
	var confirmPassword = encodeURIComponent(document.getElementById("confirmPassword").value) ;

	if (email=="" || verifyCode=="" || password=="" || confirmPassword==""){
		alert("您还有未输入的信息，请补充完整!!!");
		return;
	}
        
    if (window.XMLHttpRequest)
    {
        // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
        xmlhttp=new XMLHttpRequest();
    }
    else
    {
        // IE6, IE5 浏览器执行代码
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=function()
    {
        if (xmlhttp.readyState==4 &amp;&amp; xmlhttp.status==200)
        {
        	var refindPasswordResult = xmlhttp.responseText;
        	if(refindPasswordResult=='GaiDianZiYouXiangShangWeiBeiZhuCe'){
        		alert("在数据库系统中未匹配到该电子邮箱，请检查您的输入是否有误");
        		document.getElementById("email").value="" ;
        		document.getElementById("email").placeholder="该电子邮箱尚未被注册";
        		document.getElementById("email").setAttribute('class', 'tel_input change');
        		return ;
        	}
        	else if(refindPasswordResult=='WeiJianCeDaoGaiYouXiangYongYouYanZhengMa'){
        		alert("未检测到该邮箱拥有验证码，请点击发送验证码并进行正确的输入操作!!");
        		return ;
        	}
        	else if(refindPasswordResult=='ShiJianGuoChangQingChongXinFaSongYanZhengMa'){
        		alert("时间过长，原来的验证码已失效，请重新发送验证码。");
        		return ;
        	}
        	else if(refindPasswordResult=='YanZhengMaCuoWu'){
        		alert("验证码错误。");
        		return ;
        	}
        	else if(refindPasswordResult=='XiuGaiChengGong'){
        		alert("修改成功。");
        		return ;
        	}
        	else{
        		alert("系统故障了!!");
        		return ;
        	}
        }
    }
    xmlhttp.open("GET","/tiesheyuan/rbac/refind_password?email="+email+"&amp;verifyCode="+verifyCode+"&amp;password="+password+"&amp;confirmPassword="+confirmPassword,true);
    xmlhttp.send();
}
</script>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit"/>
<meta name="force-rendering" content="webkit"/>
<title>修改您的密码</title>
<style type="text/css">
	    .tel_input.change::-webkit-input-placeholder {
	   		font-family: monospace;
	   		font-weight: bolder;
      		color: #ff2f00;
      		font-size: 1.6rem;
    	}
 
    	.tel_input.change::-moz-placeholder {
     		font-family: monospace;
     		font-weight: bolder;
      		color: #ff2f00;
      		font-size: 1.6rem;
    	}
 
   	 	.tel_input.change::-ms-input-placeholder {
      		font-family: monospace;
      		font-weight: bolder;
      		color: #ff2f00;
      		font-size: 1.6rem;
   		}
	</style>

<link type="text/css" rel="stylesheet" href="assets/css/refindPassword_css/style.css" />
<script type="text/javascript" src="assets/js/refindPassword_js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
   var height=$(document).height();
   $('body').css('height',height);
   var mart=height-600;
   mart = mart/2;
   $('.loginBox').css('marginTop',mart);
})
</script>
</head>

<body>

<div class="header-title">请修改您的密码</div>
<div class="header-img"></div>

<div id="particles-js"></div>

<!-- scripts -->
	<div class="loginBox" style="margin-top:180px;">
  		<h1>找回密码</h1>
  		<div class="item">
    		<div class="icon"><img src="assets/images/refindPassword_images/icon1.png" /></div>
    		<div class="txt"><input name="email" id="email" type="text" placeholder="请输入电子邮箱" autocomplete='off' required/></div>
  		</div>
  		<div class="item">
    		<div class="icon"><img src="assets/images/refindPassword_images/icon3.png" /></div>
    		<div class="txt"><input name="verifyCode" id="verifyCode" type="text" placeholder="请输入验证码" autocomplete='off' required/></div>
    		<div class="yzm"><img style="cursor:pointer" onclick="sendVerifyCode()" src="assets/images/refindPassword_images/sendVerifyCode.jpg" /></div>
  		</div>
  		<div class="item">
    		<div class="icon"><img src="assets/images/refindPassword_images/icon1.png" /></div>
    		<div class="txt"><input name="password" id="password" type="password" onchange="isPasswordLegal()" placeholder="15-30位且含数字,字母,字符的新密码" required/></div>
  		</div>
  		<div class="item">
    		<div class="icon"><img src="assets/images/refindPassword_images/icon1.png" /></div>
    		<div class="txt"><input name="confirmPasswod" id="confirmPassword" type="password" onchange="isConfirmPasswordRight()" placeholder="请再次输入新密码" required/></div>
  		</div>
 	    <div class="item_3">
    		<input name="" type="submit" value="确认" class="btn" onclick="refindPassword()"/>
  		</div>
	</div>
</body>
</html>
