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

								<li><a href="${contrxtRoot}/home">Home</a>
								<li class="active">All Products</li>


							</ol>

						</c:if>

						<c:if test="${userClickCategoryProducts == true}">

							<ol class="breadcrum">

								<li><a href="${contrxtRoot}/home">Home</a>
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