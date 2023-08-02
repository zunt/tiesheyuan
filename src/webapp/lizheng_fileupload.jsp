<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>理正文件上传</title>
</head>
<body>
<h1>理正文件上传实例</h1>
<form method="post" action="/tiesheyuan/testpro1/dwg_pingmiantu" enctype="multipart/form-data">
	<input type=text name="xmmc" placeholder="项目名称">
	<input type=text name="xmjd" placeholder="项目阶段">
	<input type=text name="xmdl" placeholder="项目段落">
	<input type=text name="xmfa" placeholder="项目方案">
    上传理正的DWG平面图:
    <input type="file" name="dwg_pingmiantu_files" multiple="multiple"/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/dwg_zongduanmian" enctype="multipart/form-data">
    <input type=text name="xmmc" placeholder="项目名称">
	<input type=text name="xmjd" placeholder="项目阶段">
	<input type=text name="xmdl" placeholder="项目段落">
	<input type=text name="xmfa" placeholder="项目方案">
    上传理正的DWG纵断面:
    <input type="file" name="dwg_zongduanmian_files" multiple="multiple"/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/pdf" enctype="multipart/form-data">
    <input type=text name="xmmc" placeholder="项目名称">
	<input type=text name="xmjd" placeholder="项目阶段">
	<input type=text name="xmdl" placeholder="项目段落">
	<input type=text name="xmfa" placeholder="项目方案">
    上传理正的平台成果数据PDF:
    <input type="file" name="pdf_files" multiple="multiple"/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/pdf_jingtan" enctype="multipart/form-data">
    <input type=text name="xmmc" placeholder="项目名称">
	<input type=text name="xmjd" placeholder="项目阶段">
	<input type=text name="xmdl" placeholder="项目段落">
	<input type=text name="xmfa" placeholder="项目方案">
    上传理正的PDF静探:
    <input type="file" name="pdf_jingtan_files" multiple="multiple"/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/pdf_shikeng" enctype="multipart/form-data">
    <input type=text name="xmmc" placeholder="项目名称">
	<input type=text name="xmjd" placeholder="项目阶段">
	<input type=text name="xmdl" placeholder="项目段落">
	<input type=text name="xmfa" placeholder="项目方案">
    上传理正的PDF试坑:
    <input type="file" name="pdf_shikeng_files" multiple="multiple"/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/pdf_zuankong" enctype="multipart/form-data">
    <input type=text name="xmmc" placeholder="项目名称">
	<input type=text name="xmjd" placeholder="项目阶段">
	<input type=text name="xmdl" placeholder="项目段落">
	<input type=text name="xmfa" placeholder="项目方案">
    上传理正的PDF钻孔:
    <input type="file" name="pdf_zuankong_files" multiple="multiple"/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/shp" enctype="multipart/form-data">
    <input type=text name="xmmc" placeholder="项目名称">
	<input type=text name="xmjd" placeholder="项目阶段">
	<input type=text name="xmdl" placeholder="项目段落">
	<input type=text name="xmfa" placeholder="项目方案">
    上传理正的SHP:
    <input type="file" name="shp_files" multiple="multiple"/>
    <input type="submit" value="上传" />
</form>

<!--  
<form method="get" action="/tiesheyuan/projects/projects_information">
    <button>上传项目信息</button>
</form>
-->
</body>
</html>