<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-19
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Files Upload</title>
</head>
<body>

<s:form action="uploads.action" enctype="multipart/form-data">
    <s:file name="upload" label="file1"/>
    <s:file name="upload" label="file2"/>
    <s:file name="upload" label="file3"/>
    <s:submit value="submit"/>
</s:form>

</body>
</html>
