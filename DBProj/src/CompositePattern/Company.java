package CompositePattern;

public class Company {
    public static void main(String[] args) {
        Manager ma1 = new Manager("test","123");
        Manager ma2 = new Manager("Sun","444");
        Composite com1 = new Composite();
        com1.addEmployee(ma1);
        com1.addEmployee(ma2);

        Developer dev1 = new Developer("aaa","1111");
        Developer dev2 = new Developer("bbb","1234");
        Composite com2 = new Composite();
        com2.addEmployee(dev1);
        com2.addEmployee(dev2);

        Composite com3 = new Composite();
        com3.addEmployee(com1);
        com3.removeEmployee(com2);
        com3.EmployeeDetail();
    }
}
