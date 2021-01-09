<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 1/5/2021
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css" />
    <script defer type="text/javascript" src="js/time.js"></script>

</head>
<body onload="alertPage()">
<h1 class="time" id="timeoutput"><c:out value="${time}"/></h1>

</body>
</html>
