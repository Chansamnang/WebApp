import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("name");
        if (user.trim().equals("Samnang")){
//            response.sendRedirect("newjsp.jsp");
            PrintWriter pt = response.getWriter();
            pt.println("Cocococococ");
            RequestDispatcher rd = request.getRequestDispatcher("newjsp.jsp");
//            rd.forward(request,response);
            rd.include(request,response);
        }
        else {
            RequestDispatcher rd = request.getRequestDispatcher("newjsp.jsp");
            rd.include(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
