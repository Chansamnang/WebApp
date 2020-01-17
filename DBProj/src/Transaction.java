import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction {
    public static void main(String[] args){
        transact();
    }
    public static void transact(){
        Connection con = null;
        Statement st;
        Scanner s = new Scanner(System.in);
        int debId = 0;
        int creId = 0;
        int amt = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/kit?autoReconnect=true&useSSL=false","root","");
            con.setAutoCommit(false); //The feature of connection object
            st = con.createStatement();
            System.out.println("Enter id to debit money: ");
            debId = s.nextInt();
            System.out.println("Enter the amount to transfer : ");
            amt = s.nextInt();
            System.out.println("Enter id to credit money : ");
            creId = s.nextInt();
            st.executeUpdate("update bank set amt = amt - '"+amt+"' where id = '"+debId+"'");
            st.executeUpdate("update bank set amt = amt + '"+amt+"' where id = '"+creId+"'");
            con.commit(); // commit here is like we are saving our file even we don't call commit our SQL still execute and save to database
        }catch (ClassNotFoundException e){
            System.out.println("Driver loading falied");
        }catch (SQLException e){
            try{
                con.rollback(); // is like making our program related to each other if one error so other should not executed
                System.out.println("Transaction failed... ");
            } catch (SQLException ex){
                System.out.println("Rollback failed....");
            }
        }
    }
}
