<%--
  Created by IntelliJ IDEA.
  User: 徐程意
  Date: 2019/11/8
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
<a href="/user/testString">testtestteststring</a>
<a href="/user/testVoid">testtesttestVOid</a><br/>
<a href="/user/TestModelAndView">TestModelAndView</a>
<script>
    function getJsonData() {
        axios.get('/')
    }
</script>
</body>
</html>
