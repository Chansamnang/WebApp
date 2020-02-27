import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user");
        PrintWriter writer = response.getWriter(); //convert java to html response
        String ip = request.getRemoteAddr(); // getRemoteAddr is use to get IP Address
        writer.println("Welcome : "+ name + " :IP: "+ip);

        Enumeration<String> headerName = request.getHeaderNames();

        System.out.println(name+" : "+ip);
        while (headerName.hasMoreElements()){
            String header = headerName.nextElement();
            String value = request.getHeader(header);
            System.out.println(header + ": "+value);

        }
        System.out.println("****************");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
