import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayDiscount", value = "/DisplayDiscount")
public class DisplayDiscount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String productDescription = request.getParameter("productDescription");
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));

        float discountAmount = listPrice * discountPercent * 0.01f;
        float discountPrice = listPrice - discountAmount;

 PrintWriter writer = response.getWriter();
writer.println("<html><head><title>Discount Calculator Result</title></head><body>");
writer.println("<table border='1'>");
writer.println("<tr><th>Product Description</th><td>" + productDescription + "</td></tr>");
writer.println("<tr><th>List Price</th><td>$" + listPrice + "</td></tr>");
writer.println("<tr><th>Discount Percent</th><td>" + discountPercent + "%</td></tr>");
writer.println("<tr><th>Discount Amount</th><td>$" + discountAmount + "</td></tr>");
writer.println("<tr><th>Discount Price</th><td>$" + discountPrice + "</td></tr>");
writer.println("</table>");
writer.println("</body></html>");
    }
}