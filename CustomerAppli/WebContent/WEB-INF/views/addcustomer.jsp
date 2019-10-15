<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
<style type="text/css">
.error{
color: red;
}
</style>
</head>
<body>
<form:form action="addcustomer" method="post" modelAttribute="customer">
<form:hidden path="id"/>
Enter name:<form:input path="name"/><form:errors path="name" class="error"/><br/>
Enter city:<form:input path="city"/><form:errors path="city" class="error"/><br/>
Enter country:<form:input path="country"/><form:errors path="country" class="error"/><br/>
Enter phoneno:<form:input path="phoneno"/><form:errors path="phoneno" class="error"/><br/>
Enter pubEmail:<form:input path="pubEmail"/><form:errors path="pubEmail" class="error"/><br/>

<input type="submit"/>
</form:form>

</body>
</html>