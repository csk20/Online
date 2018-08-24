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
	<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<%@include file="./shared/sidebar.jsp"%>

			</div>

			<div class="col-md -9">
				<div class="row">

					<div class="row">
						<div class="col-xs-12">



							<c:if test="${userClickAllProducts == true}">

								<ol class="breadcrumb">

									<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
									<li class=" breadcrumb-item active">All Products</li>


								</ol>
								<table id="productListTable"
									class="table  table-striped table-borderd">

									<thead>

										<tr>
											<th>ID</th>
											<th>Name</th>
										</tr>
									</thead>




								</table>


							</c:if>

							<c:if test="${userClickCategoryProducts == true}">

								<ol class="breadcrumb">

									<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
									<li class="breadcrumb-item"><a href="#">Category</a></li>
									<li class="breadcrumb-item active">${category.name}</li>

								</ol>
								<table id="productListTable"
									class="table  table-striped table-borderd">

									<thead>

										<tr>
											<th>ID</th>
											<th>Name</th>
										</tr>
									</thead>




								</table>

							</c:if>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>

</body>
</html>