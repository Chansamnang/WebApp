import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        if (name.trim().equals("Dane")) {
            Cookie nameCookie = new Cookie("name", name);
            response.addCookie(nameCookie);
            Cookie emailCookie = new Cookie("email", name);
            response.addCookie(emailCookie);

            PrintWriter pt = response.getWriter();
            pt.println("Hi Dane...");
            }
        }
        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {
            handle(request, response);
        }

        protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {
            handle(request, response);
        }
}
