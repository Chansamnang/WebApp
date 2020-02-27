import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LogoutServlet")
public class LogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for(Cookie ck : cookies){
            ck.setValue(null);
            ck.setMaxAge(0); //setMaxAge method is use how long you want a cookie in the browser
            response.addCookie(ck);
        }
        PrintWriter out = response.getWriter();
        out.println("");
        response.sendRedirect("index.jsp");
    }
}
