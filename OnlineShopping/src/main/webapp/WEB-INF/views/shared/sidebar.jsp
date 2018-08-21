<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
 <h1 class="my-4">Shop Name</h1>
          <div class="list-group">
         <c:forEach items="${categories}" var="category">
         
          
            <a href="${contextRoot}/show/categories/${category.id}/products" id="a_${category.name}"  class="list-group-item">${category.name}</a>
          
            </c:forEach>
          </div>	