import java.sql.*;
import java.util.ArrayList;

public class DBOperation {
    public static void insertRecord(ArrayList<b6c> dto) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/kit?autoReconnect=true&useSSL=false","root","");
        PreparedStatement st = con.prepareStatement("insert into b6c values (?,?)");
        dto.forEach((n) -> {
            try {
                st.setString(1,n.getId());
                st.setString(2,n.getName());
                st.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }
    public ResultSet readRecord(int id) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/kit?autoReconnect=true&useSSL=false","root","");
        Statement st = con.createStatement();
        return  st.executeQuery("SELECT * FROM b6c WHERE ID = " +id);
    }
}
