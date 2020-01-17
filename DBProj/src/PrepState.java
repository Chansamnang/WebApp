import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepState {
    public static void main(String[] args) {
        int num = 0;
        String id = "";
        String name = "";
        Scanner s = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/kit?autoReconnect=true&useSSL=false","root","");
            PreparedStatement ps = con.prepareStatement("insert into b6c values (?,?)");
//            ps.addBatch("insert into b6c values ('1700', 'Gusion')"); //Query to insert value to the database
//            ps.addBatch("update b6c set name = 'Jawhead' where id ='19'"); // Query to update value to the database
            System.out.println("Enter number of records to insert : ");
            num = s.nextInt();
            for (int i =0; i<num; i++){
                id = s.next();
                name = s.next();
                ps.setString(1,id);
                ps.setString(2,name);
                ps.addBatch();
            }
            ps.executeBatch();
            ps.close(); // after the executing the query we need to close the statement
            con.close(); // we need to close the connection after the program executed because otherwise it's still connected to the database and program can be error
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}
