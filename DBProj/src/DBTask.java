import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class DBTask {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many user you want to input ?");
        int user = scan.nextInt();
        ArrayList<b6c> arr = new ArrayList<>();
        b6c dto;
        for(int i=0; i<user; i++){
            dto = new b6c();
            dto.setId(scan.next());
            dto.setName(scan.next());
            arr.add(dto);
        }
        DBOperation dbo = new DBOperation();
        dbo.insertRecord(arr);
        System.out.println("Enter id : ");
        int id = scan.nextInt();
        ResultSet rs = dbo.readRecord(id);
        while (rs.next()) {
            System.out.println(rs.getString("id") + ", "+ rs.getString("name"));
        }
    }
}
