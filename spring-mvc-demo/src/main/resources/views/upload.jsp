<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html" http-equiv="Content-Type; charset=UTF-8">
    <title>upload page</title>
</head>
<body>
<div class="upload">
    <!--转向访问/upload接口-->
    <form action="upload"  enctype="multipart/form-data" method="post">
        <input type="file" name="file"><br/>
        <input type="submit" value="上传">
    </form>
</div>
</body>
</html>