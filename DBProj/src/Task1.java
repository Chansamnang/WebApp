import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String idIn = "";
        String nameIn = "";
        ArrayList<b6c> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/kit?autoReconnect=true&useSSL=false", "root", "");
            PreparedStatement st = con.prepareStatement("insert into b6c values (?,?)");
            System.out.println("Enter how many number of users you want to input?");
            int input = scan.nextInt();
            b6c dto=null;
            for(int i=0; i<input; i++){
                dto = new b6c();
                System.out.println("Enter an id : ");
                idIn = scan.next();
                dto.setId(idIn);
                System.out.println("Enter name : ");
                nameIn = scan.next();
                dto.setName(nameIn);
                arr.add(dto);
            }
            arr.forEach((n) -> {
                try {
                    st.setString(1,n.getId());
                    st.setString(2,n.getName());
                    st.execute();
                } catch (SQLException e) {
                    System.out.println(e);;
                }
            });
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}