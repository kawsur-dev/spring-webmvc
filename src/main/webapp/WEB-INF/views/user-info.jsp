<%--
  Created by IntelliJ IDEA.
  User: Teacher
  Date: 4/5/2022
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User Info</title>
</head>
<body>

<form:form action="process" method="post" modelAttribute="user">
    First Name: <form:input path="firstname"/>
    <form:errors path="firstname" cssClass="merror"/>

    <br><br>
    Last Name: <form:input path="lastname"/>
    <form:errors path="lastname" cssClass="merror"/>

    <br><br>
    <input type="submit" value="Submit" />
</form:form>

</body>
</html>
