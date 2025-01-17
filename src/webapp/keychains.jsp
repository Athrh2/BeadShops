<%@ page import="java.util.List" %>
<%@ page import="models.Product" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<h2>Our Keychains</h2>
<table border="1">
    <thead>
    <tr>
        <th>Keychain</th>
        <th>Description</th>
        <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Product> keychains = (List<Product>) request.getAttribute("keychains");
        if (keychains != null) {
            for (Product keychain : keychains) {
    %>
    <tr>
        <td><%= keychain.getName() %></td>
        <td><%= keychain.getDescription() %></td>
        <td>$<%= keychain.getPrice() %></td>
    </tr>
    <%  } } %>
    </tbody>
</table>
<%@ include file="footer.jsp" %>
