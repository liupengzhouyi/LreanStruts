<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-20
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
    <h1>
        Hello World From Struts 2
    </h1>
    <form action="tip01.action" method="post">
        <label for="name">Please pick a name</label>
        <br>
        <select name="name">
            <option name="Mike">Mike</option>
            <option name="Jason">Jason</option>
            <option name="Mark">
                Mark
            </option>
        </select>
        <s:submit value="submit"/>
    </form>
</body>
</html>
