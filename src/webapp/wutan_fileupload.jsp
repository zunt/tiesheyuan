<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>物探文件上传</title>
</head>
<body>
<h1>物探文件上传实例</h1>
<form method="post" action="/tiesheyuan/testpro1/wutan" enctype="multipart/form-data">
    选择文件:
    <input type="file" name="wutan_files" multiple="multiple"/>
    <br/><br/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/diyingli" enctype="multipart/form-data">
    选择文件:
    <input type="file" name="diyingli_files" multiple="multiple"/>
    <br/><br/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/gaomidudianfa" enctype="multipart/form-data">
    选择文件:
    <input type="file" name="gaomidudianfa_files" multiple="multiple"/>
    <br/><br/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/gaomidudianfa_chengguowenjian" enctype="multipart/form-data">
    选择文件:
    <input type="file" name="gaomidudianfa_chengguowenjian_files" multiple="multiple"/>
    <br/><br/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/gaomidudianfa_gaomidushujuchengtao" enctype="multipart/form-data">
    选择文件:
    <input type="file" name="gaomidudianfa_gaomidushujuchengtao_files" multiple="multiple"/>
    <br/><br/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/cihualv" enctype="multipart/form-data">
    选择文件:
    <input type="file" name="cihualv_files" multiple="multiple"/>
    <br/><br/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/dadidianci" enctype="multipart/form-data">
    选择文件:
    <input type="file" name="dadidianci_files" multiple="multiple"/>
    <br/><br/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/hangkongwutan" enctype="multipart/form-data">
    选择文件:
    <input type="file" name="hangkongwutan_files" multiple="multiple"/>
    <br/><br/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/qiankongbosuceshi" enctype="multipart/form-data">
    选择文件:
    <input type="file" name="qiankongbosuceshi_files" multiple="multiple"/>
    <br/><br/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/tongmai_InSAR_jiance" enctype="multipart/form-data">
    选择文件:
    <input type="file" name="tongmai_InSAR_jiance_files" multiple="multiple"/>
    <br/><br/>
    <input type="submit" value="上传" />
</form>

<form method="post" action="/tiesheyuan/testpro1/zonghecejing" enctype="multipart/form-data">
    选择文件:
    <input type="file" name="zonghecejing_files" multiple="multiple"/>
    <br/><br/>
    <input type="submit" value="上传" />
</form>
</body>
</html>