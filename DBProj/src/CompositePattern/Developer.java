package CompositePattern;

public class Developer implements Employee {
    private String name;
    private String id;
    public Developer(String name, String id){
        this.name = name;
        this.id = id;
    }
    public void EmployeeDetail() {
        System.out.println("Name: " + name + " id: "+id);
    }
}
