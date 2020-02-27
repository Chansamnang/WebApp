import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Validate")
public class Validate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        student s = new student();
        s.setId(Integer.parseInt(id));
        s.setName(name);
        DBOperation operation = new DBOperation();
        if(operation.insertRecord(s)){
            System.out.println("Data inserted successfully");
            request.setAttribute("student",s);
        } else {
            System.out.println("Data inserted unsuccessfully");
            request.setAttribute("student",null);
        }
        RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
        rd.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
