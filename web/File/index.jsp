<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018/12/19
  Time: 0:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload File</title>
</head>
<body>
<s:form action="upload.action" method="POST" enctype="multipart/form-data">
    <%--enctype是from的属性，multipart/form-data 表示把该编码方式设置为二进制方式--%>
    <s:file name="file" label="Upload file"/>
    <s:submit value="Submit"/>
</s:form>
</body>
</html>
