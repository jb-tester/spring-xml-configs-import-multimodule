<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>home</title>
</head>
<body>
<h3>List:</h3>
<ul>
    <c:forEach var="bean" items="${web_list}">
        <li>${bean}</li>
    </c:forEach>
</ul>

<h5>Some bean from web root xml:</h5>
${autowiredBean}
</body>
</html>
