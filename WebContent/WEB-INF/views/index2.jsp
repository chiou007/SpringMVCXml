<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="price" scope="page" value="1000"> </c:set>

	<h1>Hello Spring MVC</h1>
<c:if test="${price>500 }"> Wow!</c:if>
<c:if test="${price > 500 }" var="priceCheck" scope="page"></c:if>
<c:if test="${priceCheck==true }">Good!</c:if>
<br>
<c:choose>
	<c:when test="${price<=1000 }">
		1000이하
	</c:when>
	<c:when test="${price>1000 }">
	    1000 초과
	</c:when>	
</c:choose>
<br>
<c:forEach var="order" begin="1" end="10" step="1">

	Order ${order }<br/>
</c:forEach>

<!-- jstl Tokens -->
<c:forTokens items="phone, car, computer" delims="," var="product">
	${product }<br>
</c:forTokens>

<!-- c:url URL 문자열 리턴 -->
<a href='<c:url value="/test/index.jsp"/>'>여기</a>를 클릭하세요<br>

<c:url value="/test/index.jsp" var="testUrl">
	<c:param name="productPrice" value="1000"></c:param>
	<c:param name="productName" value="phone"></c:param>
</c:url>
${testUrl }


</body>
</html>