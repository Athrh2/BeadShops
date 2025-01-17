// KeychainServlet.java
package servlet;

import models.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KeychainServlet extends HttpServlet {
    private List<Product> keychains;

    @Override
    public void init() {
        keychains = new ArrayList<>();
        keychains.add(new Product(1, "Heart Keychain", 5.99, "A heart-shaped keychain."));
        keychains.add(new Product(2, "Star Keychain", 4.99, "A star-shaped keychain."));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("keychains", keychains);
        RequestDispatcher dispatcher = req.getRequestDispatcher("keychains.jsp");
        dispatcher.forward(req, resp);
    }
}
