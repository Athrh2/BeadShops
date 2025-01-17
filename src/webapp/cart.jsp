<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<h2>Your Cart</h2>
<table border="1">
    <thead>
    <tr>
        <th>Product</th>
        <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<models.Product> cart = (List<models.Product>) request.getAttribute("cart");
        if (cart != null) {
            for (models.Product product : cart) {
    %>
    <tr>
        <td><%= product.getName() %></td>
        <td><%= product.getPrice() %></td>
    </tr>
    <%  } } %>
    </tbody>
</table>
<%@ include file="footer.jsp" %>
