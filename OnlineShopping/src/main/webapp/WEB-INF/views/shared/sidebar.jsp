<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <h1 class="my-4">Shop Name</h1>
          <div class="list-group">
         <c:forEach items="${categeries}" var="category">
         
          
            <a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item">${category.name}</a>
          
            </c:forEach>
          </div>	