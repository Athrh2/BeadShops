<%@ page import="java.util.List" %>
<%@ page import="models.Product" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<h2>Our Keyrings</h2>
<table border="1">
    <thead>
    <tr>
        <th>Keyring</th>
        <th>Description</th>
        <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Product> keyrings = (List<Product>) request.getAttribute("keyrings");
        if (keyrings != null) {
            for (Product keyring : keyrings) {
    %>
    <tr>
        <td><%= keyring.getName() %></td>
        <td><%= keyring.getDescription() %></td>
        <td>$<%= keyring.getPrice() %></td>
    </tr>
    <%  } } %>
    </tbody>
</table>
<%@ include file="footer.jsp" %>
