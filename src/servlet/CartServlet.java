// CartServlet.java
package servlet;

import models.Cart;
import models.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CartServlet extends HttpServlet {
    private Cart cart;

    @Override
    public void init() {
        cart = new Cart();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("cart", cart.getProducts());
        RequestDispatcher dispatcher = req.getRequestDispatcher("cart.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String description = req.getParameter("description");

        Product product = new Product(id, name, price, description);
        cart.addProduct(product);

        resp.sendRedirect("cart.jsp");
    }
}
