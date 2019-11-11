<%--
  Created by IntelliJ IDEA.
  User: 徐程意
  Date: 2019/11/8
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="/param/hello" method="post">--%>
<%--    id:<input type="text" name="id"/><br/>--%>
<%--    用户名:<input type="text" name="username"/><br/>--%>

<%--    list1uname:<input type="text" name="users[0].uname"/><br/>--%>
<%--    list1money:<input type="text" name="users[0].money"/><br/>--%>

<%--    map1uname:<input type="text" name="userMap['one'].uname"/><br/>--%>
<%--    map1money:<input type="text" name="userMap['one'].money"/><br/>--%>
<%--    <input type="submit" value="提交"/><br/>--%>
<%--</form>--%>

<form action="/param/cdate" method="post">
    username:<input type="text" name="uname"/><br/>
    date:<input type="text" name="date"><br />
    <input type="submit" value="提交"/>
</form>
<a href="/param/servlet">ooooooooooooooo</a>

<a href="/anno/testsession">session</a>
</body>
</html>
