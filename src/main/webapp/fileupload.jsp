<%--
  Created by IntelliJ IDEA.
  User: 徐程意
  Date: 2019/11/9
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <form method="post" action="/file/upload" enctype="multipart/form-data">--%>
<%--        选择文件：<input type="file" name="upload"/><br/>--%>
<%--        <input type="submit" value="上传"/>--%>
<%--    </form>--%>

<%--    <form method="post" action="/file/springupload" enctype="multipart/form-data">--%>
<%--        选择文件：<input type="file" name="upload"/><br/>--%>
<%--        <input type="submit" value="上传"/>--%>
<%--    </form>--%>

<%--跨服务器文件上传--%>
    <form method="post" action="/file/springupload_cros" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>
