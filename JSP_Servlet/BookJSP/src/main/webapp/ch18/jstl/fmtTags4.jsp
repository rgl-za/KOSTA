<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>JSTL</title>
</head>
<body >
<h2>Formatting Tags4</h2>
<fmt:setBundle var="note" basename="ch18.note"/>
<fmt:message bundle="${note}" key="country"/>&nbsp;
<fmt:message bundle="${note}" key="siteName"/>&nbsp;
<fmt:message bundle="${note}" key="msg">
	<fmt:param value="${param.msg}"/>
</fmt:message>
</body>
</html>