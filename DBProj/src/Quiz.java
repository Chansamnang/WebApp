import java.sql.*;
import java.util.Scanner;

public class Quiz {
    static Connection con = null;
    static Statement st = null;
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1,2,3");
        System.out.println("1. Read a single record");
        System.out.println("2. Read all record from the table");
        System.out.println("3. Read specific record from the table");
        int input = scan.nextInt();
        if(input == 3){
            System.out.println("Enter the specific id : ");
            int id = scan.nextInt();
            ResultSet rs = readSpecRecord(id);
            while(rs.next()){
                System.out.println(rs.getString("id")+" , "+rs.getString("name"));
            }
        } else if (input == 2){
            System.out.println("This will show all the record in the table");
            ResultSet rs = readAllRecord();
            while (rs.next()){
                System.out.println(rs.getString("id")+" , "+rs.getString("name"));
            }
        } else if (input == 1){
            System.out.println("This will show a single record in the table");
            ResultSet rs = readSingleRecord();
            while(rs.next()){
                System.out.println(rs.getString("id")+" , "+rs.getString("name"));
            }
        }
    }
    public static void connection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3308/kit?autoReconnect=true&useSSL=false","root","");
    }
    public static ResultSet readSpecRecord(int id) throws Exception{
        connection();
        Statement st = con.createStatement();
        return st.executeQuery("SELECT * FROM b6c WHERE ID = " + id);
    }
    public static ResultSet readAllRecord() throws Exception{
        connection();
        Statement st = con.createStatement();
        return st.executeQuery("SELECT * FROM b6c");
    }
    public static ResultSet readSingleRecord() throws Exception{
        connection();
        Statement st = con.createStatement();
        return st.executeQuery("SELECT * FROM b6c limit 1");
    }
}