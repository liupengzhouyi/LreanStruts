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
<h2>Example of Generator Tag</h2>
<h3>The colours of rainbow:</h3>

<s:generator val="%{'Violet,Indigo,Blue,Green,Yellow,Orange,Red '}" count="7" separator=",">
    <s:iterator>
        <s:property /><br/>
    </s:iterator>
</s:generator>
</body>
</html>
