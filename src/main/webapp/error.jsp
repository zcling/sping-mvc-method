<%--
  Created by IntelliJ IDEA.
  User: zcl
  Date: 2019-04-26
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="static/jquery-3.2.0.min.js"></script>
<body>
<form method="post" action="cookie">
    <p>线上错误500</p>
</form>
<script type="text/javascript">
    /*function tijiao() {
     alert("测试");
     $.post(
     'http://bxglpt.citgroup.cn/member!wxRegister.action',
     {
     viewId: 1748,
     openid: 1748,
     mobile: 1748
     },
     function (data) {
     $.hideLoading();
     if (data.code != 200) {
     $.alert(data.message);
     return false;
     }
     $.toast("绑定成功", function () {
     window.location.href = 'http://bxglpt.citgroup.cn/WeChat/wx/member.jsp?appid=wx1cc643b1fef4d95b&viewid=1749';
     });
     }, 'jsonp');
     }*/

    function tijiao() {
        window.location.href = 'http://bxglpt.citgroup.cn/WeChat/wx/member.jsp?appid=wx1cc643b1fef4d95b&viewid=1749';
    }

</script>
</body>
</html>
