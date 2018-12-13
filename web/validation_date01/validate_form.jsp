<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-13
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>验证数据</title>
</head>
<body>
    <s:form action="new_validate" >
        <s:textfield name="msg" label="姓名" />
        <s:textfield name="age" label="年龄" />
        <s:submit />
    </s:form>
</body>
</html>
