import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class test {
    public static void main(String[] args) {
        try
        {
            String dbUrl = "jdbc:mysql://localhost:3308/kit";
            String user = "root";
            String pass ="";

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading successfully...");
            Connection con = DriverManager.getConnection(dbUrl,user,pass);
            System.out.println("Connection Succeed...");
            Statement st = con.createStatement();
            System.out.println("Statement Created....");

            st.executeUpdate("insert into b6c values ('3', 'Samnang')");
            System.out.println("Success...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
