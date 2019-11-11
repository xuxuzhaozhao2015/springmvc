<%--
  Created by IntelliJ IDEA.
  User: 徐程意
  Date: 2019/11/8
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha256-pasqAKBDmFT4eHoN2ndd6lN370kFiGUFyTiUHWhU7k8="
            crossorigin="anonymous"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {


                axios.post('/json/get',{uname:"mingmenui"}).then(res=>{
                    console.log(res)
                })
            })
        })
    </script>
</head>
<body>
<div>

    <button id="btn">请求数据</button>
</div>
</body>
</html>
