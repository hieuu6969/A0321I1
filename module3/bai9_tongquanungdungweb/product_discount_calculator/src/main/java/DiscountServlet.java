import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("listPrice"));
        String productDescription = request.getParameter("productDescription");
        int discountPercent = Integer.parseInt(request.getParameter("discountPercent"));
        float discountAmount = (float) (price * discountPercent * 0.01);
        float discountPrice = price - discountAmount;

        request.setAttribute("productDescription", productDescription);
        request.setAttribute("price", price);
        request.setAttribute("discountPercent", discountPercent);
        request.setAttribute("discountPrice", discountPrice);
        request.setAttribute("discountAmount", discountAmount);

        request.getRequestDispatcher("display-discount.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
