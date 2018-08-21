<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<%@include file="./shared/sidebar.jsp"%>

			</div>

			<div class="col-md -9">
				<div class="row">
					<div class="col-lg-12">
						<c:if test="${userClickAllProducts == true}">

							<ol class="breadcrum">

								<li><a href="${contextRoot}/home">Home</a></li>
								<li class="active">All Products</li>


							</ol>

						</c:if>

						<c:if test="${userClickCategoryProducts == true}">

							<ol class="breadcrum">

								<li><a href="${contextRoot}/home">Home</a></li>
								<li class="active">Category</li>
								<li class="active">${category.name}</li>

							</ol>

						</c:if>

					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>