package CompositePattern;

public class Manager implements Employee{
    private String name;
    private String id;
    public Manager(String name, String id){
        this.name = name;
        this.id = id;
    }

    @Override
    public void EmployeeDetail() {
        System.out.println("Name : "+name + "id : "+id);
    }
}
