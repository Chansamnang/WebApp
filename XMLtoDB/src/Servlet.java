import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    Connection con = null;
    @Override
    public void init() throws ServletException {
        super.init();
        ServletConfig sc = getServletConfig();
        String driver = sc.getInitParameter("driver");
        String url = sc.getInitParameter("url");
        String username = sc.getInitParameter("user");
        String password = sc.getInitParameter("password");

        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig sc = getServletConfig();
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        try {
            PreparedStatement st = con.prepareStatement("insert into b6c value (?,?)");
            st.setString(1,id);
            st.setString(2,name);
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
