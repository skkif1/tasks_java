<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
second.page
<h1>${user.name}</h1>

<form action="third" method="get">
<input type="submit" value="third">
</form>

  </body>
</html>
