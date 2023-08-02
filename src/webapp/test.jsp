<%@ page contentType="text/html; charset=UTF-8" %>
<body>  
	<h2>文件上传实例</h2>  
 	<form action="testfile" method="post" enctype="multipart/form-data">  
		选择文件:<input type="file" name="file">  
		<input type="submit" value="提交">   
	</form>
</body>  