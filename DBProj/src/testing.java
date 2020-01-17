import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class testing {
    private static Statement st = null;
    private static b6c dbo = new b6c();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id and name: ");
        dbo.setId(scanner.next());
        dbo.setName(scanner.next());
        DBOperation();
    }
    public static void getStatement() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/kit?autoReconnect=true&useSSL=false","root","");
        st = connection.createStatement();
    }
    public static void DBOperation() throws Exception{
        getStatement();
        st.execute("insert into b6c values ('"+dbo.getId()+"','"+dbo.getName()+"')");
    }
}
