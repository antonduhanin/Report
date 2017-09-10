<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reports</title>
    <link rel="stylesheet" href="/css/styleResult.css">
</head>
<body>
<div class="block">
<TABLE >

    <c:forEach var="elem" items="${reports}">
    <tr>
        <td> <fmt:formatDate value="${elem.startDate}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
        <td> <fmt:formatDate value="${elem.endDate}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
        <td> <c:out value="${elem.performer}"/> </td>
        <td> <c:out value="${elem.activity}"/> </td>
    </tr>
    </c:forEach>
    </TABLE>
</div>
</body>
</html>
