import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DBOperation {
    Connection con = null;
    public Connection getCon() throws ClassNotFoundException, SQLException {
        if (con == null){
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/student", "root", "");
        }
        return con;
    }
    public boolean insertRecord(student student){
        int id = student.getId();
        String name = student.getName();
        try {
            getCon();
            PreparedStatement ps = con.prepareStatement("insert into student values (?,?)");
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.execute();
            return true;
        } catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return false;
    }
    public int insertRecords(List<student> studentList){
        int count = 0;
        try {
            getCon();
            PreparedStatement ps = con.prepareStatement("insert into b6c values(?,?)");
            for(student student:studentList){
                ps.setInt(1,student.getId());
                ps.setString(2,student.getName());
                ps.addBatch();
                count++;
            }
            ps.executeBatch();
        } catch (Exception e){
            System.out.println(e);
        }
        return count;
    }
}
