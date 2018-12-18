<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-14
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一个表单有多个提交</title>
</head>
<body>
    <s:form action="submit.action">
        <s:textfield name="msg" label="输入内容" />
        <s:submit name="save" value="保存" align="left" method="save" />
        <s:submit name="print" value="打印" align="left" method="print" />
    </s:form>
</body>
</html>
