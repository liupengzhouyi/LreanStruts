<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-20
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>If-else标签</title>
</head>
<body>
    <h1>
        Example of If and Else
    </h1>
    <s:if test="name=='Mike'">
        Your&nbsp;have&nbsp;selected&nbsp;'Mike';
    </s:if>
    <s:elseif test="name=='Jason'">
        Your&nbsp;have&nbsp;selected&nbsp;'Jason';
    </s:elseif>
    <s:else>
        you&nbsp;have&nbsp;not&nbsp;selected&nbsp;'Mike'&nbsp;or&nbsp;'Jason';
    </s:else>
</body>
</html>
