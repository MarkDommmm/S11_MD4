<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 style="text-align: center">Show Product</h2>
<form action="/Home">
    <input type="text" name="search">
    <input type="submit" value="SEARCH" name="action">
</form>
<a href="/View/AddProduct.jsp">Add Product</a>

<table border="1" style="text-align: center">
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Year Of Manufacture</th>
        <th>Description</th>
        <th colspan="2">Action</th>
    </tr>
    <c:forEach items="${computer}" var="c" varStatus="iterator">
        <tr>
            <td>${iterator.count}</td>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.price}$</td>
            <td>${c.yearOfManufacture}</td>
            <td>${c.description}</td>
            <td><a href="/Home?action=EDIT&id=${c.id}">Edit</a></td>
            <td><a href="/Home?action=DELETE&id=${c.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
