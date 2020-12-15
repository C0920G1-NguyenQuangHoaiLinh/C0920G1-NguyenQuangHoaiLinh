import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountProductsServlet", urlPatterns = "/")
public class DiscountProductsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discount = Double.parseDouble(request.getParameter("discount"));

        double amount = listPrice * discount * 0.01;
        double discountPrice = listPrice - amount;

        PrintWriter display = response.getWriter();
        display.println("<html>");
        display.println("<h1> Discount Amount : " + amount + "</h1>");
        display.println("<h1> Discount Price : " + discountPrice + "</h1>");
        display.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
