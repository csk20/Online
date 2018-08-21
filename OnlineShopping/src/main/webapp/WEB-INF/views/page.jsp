<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<spring:url var="jquery" value="/resources/jquery" />
<!DOCTYPE html>
<html lang="en">


<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping-${title}</title>

<script type="text/javascript">
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/shop-homepage.css" rel="stylesheet">

</head>

<body>


	<div class="wrapper">
		<%--   <c:set var="contextRoot" value="${pageContext.request.contextPath}"/> --%>

		<!-- Navigation -->

		<%@ include file="./shared/navbar.jsp"%>



		<!-- Page Content -->

		<div class="content">

			<c:if test="${userClickHome==true }">
				<%@ include file="home.jsp"%>
			</c:if>


			<c:if test="${userClickAbout==true }">
				<%@ include file="about.jsp"%>
			</c:if>



			<c:if test="${userClickContact==true }">
				<%@ include file="contact.jsp"%>
			</c:if>


			<c:if test="${userClickAllProducts==true }">
				<%@ include file="listProducts.jsp"%>
			</c:if>


			<c:if test="${userClickCategoryProducts==true }">
				<%@ include file="listProducts.jsp"%>
			</c:if>
		</div>

		<!-- /.container -->

		<div class="wrapper">




			<!-- Footer -->

			<%@ include file="./shared/footer.jsp"%>

			<!-- Bootstrap core JavaScript -->
			<script src="${jquery}/jquery.min.js"></script>
			<script src="${js}/bootstrap.bundle.min.js"></script>

			<!-- selfCoded JavaScript -->
			<script src="${js}/myapp.js"></script>


		</div>
	</div>
</body>

</html>

