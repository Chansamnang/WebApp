import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many number of users you want to input?");
        int input = scan.nextInt();
        b6c dto = new b6c();
        for(int i=0; i<input; i++) {
            System.out.println("Enter an id : ");
            dto.setId(scan.next());
            System.out.println("Enter name : ");
            dto.setName(scan.next());
        }
        insertRecord(dto);
    }
    public static void insertRecord(b6c dto) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/kit?autoReconnect=true&useSSL=false", "root", "");
            PreparedStatement st = con.prepareStatement("insert into b6c values (?,?)");
            st.setString(1,dto.getId());
            st.setString(2,dto.getName());
            st.execute();
    }
}