<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>


	<form:form action="check-user" commandName="user" method="post">

		<form:input path="name" type = "text"/>
		<form:input path="password"/>
		<form:input path="email"/>
		<input type="submit" value="submit">
	</form:form>


</body>
</html>