import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBOperation {
    Connection con = null;
    public Connection getCon() throws ClassNotFoundException, SQLException {
        if (con == null){
//            Class.forName("org.postgresql.Driver");
//            String url = "jdbc:postgresql://127.0.0.1:63921/student?user=postgres&password=1234&ssl=true";
//            con = DriverManager.getConnection(url);
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/kit?autoReconnect=true&useSSL=false","root","");
        }
        return con;
    }
    public boolean insertRecord(student student){
        int id = student.getId();
        String name = student.getName();
        try {
            getCon();
            PreparedStatement ps = con.prepareStatement("insert into b6c values (?,?)");
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.execute();
            return true;
        } catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
}
