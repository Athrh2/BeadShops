// KeyringServlet.java
package servlet;

import models.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KeyringServlet extends HttpServlet {
    private List<Product> keyrings;

    @Override
    public void init() {
        keyrings = new ArrayList<>();
        keyrings.add(new Product(1, "Golden Keyring", 8.99, "A premium golden keyring."));
        keyrings.add(new Product(2, "Silver Keyring", 6.99, "A shiny silver keyring."));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("keyrings", keyrings);
        RequestDispatcher dispatcher = req.getRequestDispatcher("keyrings.jsp");
        dispatcher.forward(req, resp);
    }
}
