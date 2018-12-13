<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-13
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloWorld!</title>
</head>
<body>
<h1>
    <center>
        Hello World!
    </center>
</h1>
<hr>
<%--<form action="struts.action" method="post">
    情输入姓名：<input type="text" name="name">
    <br>
    <input type="submit" value="提交">
</form>--%>

<s:form action="struts" method="POST">
<s:textfield name="name" label="请输入姓名"></s:textfield>
<s:submit value="提交"></s:submit>
</s:form>

</body>
</html>
