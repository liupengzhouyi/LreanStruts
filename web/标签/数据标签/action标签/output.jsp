<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018/12/20
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--1:--%>
<%--
<s:action name="hello" executeResult="true">
    Output from Hello:  <br />
</s:action>--%>
<%--2:--%>
<s:action name="hello" executeResult="false">
    Output from Hello:  <br />
</s:action>
<s:iterator value="#attr.names">
    <s:property /><br />
</s:iterator>
</body>
</html>
