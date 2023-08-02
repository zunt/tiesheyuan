<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html lang="zh">
<!-- 使用c标签进行判断需要引入下行所示的包 -->

<script type="text/javascript">
var departments_diluyuan = [
	{label:"",value:"--------请选择--------"},
	{label:"diyisuo",value:"地一所"},
	{label:"diersuo",value:"地二所"},
	{label:"disansuo",value:"地三所"},
	{label:"luyisuo",value:"路一所"},
	{label:"luersuo",value:"路二所"},
	{label:"lusansuo",value:"路三所"},
	{label:"ganghangsuo",value:"港航所"},
	{label:"yanfashi",value:"研发室"},
	{label:"qita",value:"其他"}
	]; 
var departments_xianyunyuan = [
	{label:"",value:"--------请选择--------"},
	{label:"xianyisuo",value:"线一所"},
	{label:"xianersuo",value:"线二所"},
	{label:"zhanyisuo",value:"站一所"},
	{label:"zhanersuo",value:"站二所"},
	{label:"qita",value:"其他"}
	]; 
var departments_qiaosuiyuan = [
	{label:"",value:"--------请选择--------"},
	{label:"qiaoyisuo",value:"桥一所"},
	{label:"qiaoersuo",value:"桥二所"},
	{label:"qiaosansuo",value:"桥三所"},
	{label:"suiyisuo",value:"隧一所"},
	{label:"suiersuo",value:"隧二所"},
	{label:"yanfashi",value:"研发室"},
	{label:"qita",value:"其他"}
	]; 
var qita = [
	{label:"",value:"--------请选择--------"},
	{label:"qita",value:"其他"},
	]; 
var qingxuanzezhengquedanwei = [
	{label:"",value:"---请先选择所在单位---"}
	]; 

function updateDepartmentList(){
	$("#department_list").empty();
	document.getElementById("department").value="";
	var ss = document.getElementById("department_list");
	if(document.getElementById("unit").value=='地路院'){
		$("#department_list").empty();
		for(var i = 0;i < departments_diluyuan.length; i ++){
			var department = departments_diluyuan[i] ;
			$("#department_list").append('<option label="'+department.label+'" value="'+department.value+'"></option>');
		}
	}
	else if(document.getElementById("unit").value=='线运院'){
		$("#department_list").empty();
		for(var i = 0;i < departments_xianyunyuan.length; i ++){
			var department = departments_xianyunyuan[i] ;
			$("#department_list").append('<option label="'+department.label+'" value="'+department.value+'"></option>');
		}
	}
	else if(document.getElementById("unit").value=='桥隧院'){
		$("#department_list").empty();
		for(var i = 0;i < departments_qiaosuiyuan.length; i ++){
			var department = departments_qiaosuiyuan[i] ;
			$("#department_list").append('<option label="'+department.label+'" value="'+department.value+'"></option>');
		}
	}
	else if(document.getElementById("unit").value=='其他'){
		$("#department_list").empty();
		for(var i = 0;i < qita.length; i ++){
			var qt = qita[i] ;
			$("#department_list").append('<option label="'+qt.label+'" value="'+qt.value+'"></option>');
		}
	}
	else{
		$("#department_list").empty();
		var qxzzqdw = qingxuanzezhengquedanwei[0] ;
		$("#department_list").append('<option label="'+qxzzqdw.label+'" value="'+qxzzqdw.value+'"></option>');
	}
}

function isAccountLegal(str)
{
    if (str=="")
        return;
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
        if (xmlhttp.readyState==4 && xmlhttp.status==200)
        {
        	var accountCheckResult = xmlhttp.responseText;
        	if(accountCheckResult=='GaiZhangHaoYiBeiChengGongZhuCe'){
        		document.getElementById("account").value="" ;
        		document.getElementById("account").placeholder="该账号已被成功注册";
        		document.getElementById("account").setAttribute('class', 'tel_input change');
        		return ;
        	}
        	else if(accountCheckResult=='GaiZhangHaoYiZhuCeDaiShenHe'){
        		document.getElementById("account").value="" ;
        		document.getElementById("account").placeholder="该账号已注册待审核";
        		document.getElementById("account").setAttribute('class', 'tel_input change');
        		return ;
        	}
        	else
        		return ;
        }
    }
    xmlhttp.open("GET","/tiesheyuan/rbac/account_legal_test?account="+str,true);
    xmlhttp.send();
}

function isPasswordLegal(){
	document.getElementById("confirmPassword").value="" ;
	var password = document.getElementById("password").value;
	var pwdRegex = new RegExp('^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).{15,30}$')
	
	if(!pwdRegex.test(password)) {
		document.getElementById("password").value="" ;
		if(password.length < 15 || password.length > 30)
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

function isEmailLegal(str)
{
    if (str=="")
        return;
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
        if (xmlhttp.readyState==4 && xmlhttp.status==200)
        {
        	var accountCheckResult = xmlhttp.responseText;
        	if(accountCheckResult=='GaiYouXiangYiBeiChengGongZhuCe'){
        		document.getElementById("email").value="" ;
        		document.getElementById("email").placeholder="该邮箱已被成功注册";
        		document.getElementById("email").setAttribute('class', 'tel_input change');
        		return ;
        	}
        	else if(accountCheckResult=='GaiYouXiangYiZhuCeDaiShenHe'){
        		document.getElementById("email").value="" ;
        		document.getElementById("email").placeholder="该邮箱已注册待审核";
        		document.getElementById("email").setAttribute('class', 'tel_input change');
        		return ;
        	}
        	else
        		return ;
        }
    }
    xmlhttp.open("GET","/tiesheyuan/rbac/email_legal_test?email="+str,true);
    xmlhttp.send();
}

var xmlHttp;
function isRegistrationLegal()
{
	var account = encodeURIComponent(document.getElementById("account").value);
	var trueName = encodeURIComponent(document.getElementById("trueName").value);
	var password = encodeURIComponent(document.getElementById("password").value);
	var confirmPassword = encodeURIComponent(document.getElementById("confirmPassword").value);
	var unit = encodeURIComponent(document.getElementById("unit").value);
	var department = encodeURIComponent(document.getElementById("department").value);
	var speciality = encodeURIComponent(document.getElementById("speciality").value);
	var mobile = encodeURIComponent(document.getElementById("mobile").value);
	var email = encodeURIComponent(document.getElementById("email").value);

	if(account=="" || trueName=="" || password=="" || confirmPassword=="" || unit=="" || department=="" || speciality=="" || mobile=="" || email==""){
		alert("您还有信息未填写完整，请填写完毕后再提交!!")
		return ;
	}
	
	var reg = /^\w+@[a-z0-9]+(\.[a-z]+){1,3}$/ ; 
	if(!reg.test(document.getElementById("email").value))
    {
		alert("邮箱格式不正确，请重新检查后再提交!!")
		document.getElementById("email").value="" ;
		document.getElementById("email").placeholder="请重新检查邮箱格式";
		document.getElementById("email").setAttribute('class', 'tel_input change');
    	return ;
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
        if (xmlhttp.readyState==4 && xmlhttp.status==200)
        {
        	var registrationResult = xmlhttp.responseText;
        	if(registrationResult=='YouXiangBuCunZai'){
        		alert("注册失败，该邮箱不存在!!");
        		document.getElementById("email").value="" ;
        		document.getElementById("email").placeholder="该邮箱不存在";
        		document.getElementById("email").setAttribute('class', 'tel_input change');
        		return ;
        	}
        	else if(registrationResult=='ZhuCeYiShenQing'){
        		alert("注册成功，请耐心等待工作人员的审核，届时会有相关邮件的发送，请注意查收。");
        		window.location.href="http://111.21.191.244:8503/tiesheyuan/login2.jsp?backurl="+window.location.href;
        		return ;
        	}
        	else
        		return ;
        }
    }
    xmlhttp.open("GET","/tiesheyuan/rbac/registration_test?account="+account+"&trueName="+trueName+"&password="+password+"&confirmPassword="+confirmPassword+"&unit="+unit+"&department="+department+"&speciality="+speciality+"&mobile="+mobile+"&email="+email,true);
    xmlhttp.send();
}
</script>

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>注册多源异构地质数据库账户</title>
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
<!-- 	<link rel="stylesheet" href="css/login_css/index.css"> -->
	
	<link rel="stylesheet" type="text/css" href="assets/css/register_css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="assets/css/register_css/default.css">
	<link rel="stylesheet" type="text/css" href="assets/css/register_css/styles.css">
	<script src='assets/js/register_js/prefixfree.min.js'></script>
	<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
</head>

<body>
<div class="header-title">请注册您的帐户</div>
<div class="header-img"></div>
 
<div id="logo"> 
  <h1 class="hogo"><i> Join our team now</i></h1>
</div> 

<section class="stark-login">
  <form>	
    <div class="fade-box" id="fade-box">
      <input type="text" name="account" id="account" placeholder="用户账号" onchange="isAccountLegal(this.value)" autocomplete='off' required>
      <input type="text" name="trueName" id="trueName" placeholder="真实姓名" autocomplete='off' required>
      <input type="password" name="password" id="password" placeholder="密码" onchange="isPasswordLegal()" required>
      <input type="password" name="confirmPassword" id="confirmPassword" onchange="isConfirmPasswordRight()" placeholder="确认密码" required>
      <input type="text" name="unit" id="unit" class="style1" list="unit_list" onchange="updateDepartmentList()" placeholder="单位" autocomplete='off' required>
      	<datalist class="datalist" id="unit_list" >
      		<option value="--------请选择--------" />
      		<option label="diluyuan" value="地路院" />
			<option label="xianyunyuan" value="线运院" />
			<option label="qiaosuiyuan" value="桥隧院" />
			<option label="qita" value="其他" />	
		</datalist>
	  </input>
      <input type="text" name="department" id="department" class="style1" list="department_list" placeholder="部门" autocomplete='off' required>
      	<datalist id="department_list">	
      		<option value="---请先选择所在单位---" />
		</datalist>
	  </input>
      <input type="text" name="speciality" id="speciality" class="style1" list="speciality_list" placeholder="专业" autocomplete='off' required>
      		<datalist id="speciality_list">	
      			<option value="--------请选择--------" />
      			<option label="dizhi" value="地质" />
				<option label="luji" value="路基" />
				<option label="xianlu" value="线路" />
				<option label="zhanchang" value="站场" />	
				<option label="qiaoliang" value="桥梁" />	
				<option label="suidao" value="隧道" />	
				<option label="qita" value="其他" />	
			</datalist>
      <input type="text" name="mobile" id="mobile" class="style" placeholder="手机号码" onkeyup="value=value.replace(/[^\d]/g,'')" 
	maxlength=11 autocomplete='off' required>
      <input type="email" name="email" id="email" class="style" placeholder="电子邮箱" onchange="isEmailLegal(this.value)" autocomplete='off' required>

      <button type="button" value="注册" onclick="isRegistrationLegal()">注册</button> 
    </div>
  </form>
      <div class="hexagons">
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <span>&#x2B22;</span>
        <br>
          <span>&#x2B22;</span>
          <span>&#x2B22;</span>
          <span>&#x2B22;</span>
          <span>&#x2B22;</span>
          <span>&#x2B22;</span>
          <span>&#x2B22;</span>
          <span>&#x2B22;</span>
          <span>&#x2B22;</span>
          <span>&#x2B22;</span>
          <span>&#x2B22;</span>
          <span>&#x2B22;</span>
          <br>
            <span>&#x2B22;</span>
            <span>&#x2B22;</span>
            <span>&#x2B22;</span>
            <span>&#x2B22;</span> 
            <span>&#x2B22;</span>
            <span>&#x2B22;</span>
            <span>&#x2B22;</span>
            <span>&#x2B22;</span>
            <span>&#x2B22;</span>
            <span>&#x2B22;</span>
            <span>&#x2B22;</span>
            <span>&#x2B22;</span>
            
            <br>
              <span>&#x2B22;</span>
              <span>&#x2B22;</span>
              <span>&#x2B22;</span>
              <span>&#x2B22;</span>
              <span>&#x2B22;</span>
              <span>&#x2B22;</span>
              <span>&#x2B22;</span>
              <span>&#x2B22;</span>
              <span>&#x2B22;</span>
              <span>&#x2B22;</span>
              <span>&#x2B22;</span>
              <br>
                <span>&#x2B22;</span>
                <span>&#x2B22;</span>
                <span>&#x2B22;</span>
                <span>&#x2B22;</span>
                <span>&#x2B22;</span>
                <span>&#x2B22;</span>
                <span>&#x2B22;</span>
                <span>&#x2B22;</span>
                <span>&#x2B22;</span>
                <span>&#x2B22;</span>
                <span>&#x2B22;</span>
                <span>&#x2B22;</span>
              </div>      
        </section> 
    
        <div id="circle1">
          <div id="inner-cirlce1">
            <h2> </h2>
          </div>
        </div>
    <ul>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
    </ul>
	
</body>
</html>