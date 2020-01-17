import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBPro {
    public static void main(String[] args) {
        String id1  = "";
        String name1 = "";
        Scanner s = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/kit?autoReconnect=true&useSSL=false",  "root", "");
            Statement st = con.createStatement();
            b6c dto = new b6c();
            System.out.println("Enter id and name ....");
//            id = s.next();
//            name = s.next();
            id1 = s.next();
            name1 = s.next();
            dto.setId(id1);
            dto.setName(name1);
            st.execute("insert into b6c values ('"+dto.getId()+"','"+dto.getName()+"')");
            System.out.println("Data Successfully inserted ....");
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }
    }
}
