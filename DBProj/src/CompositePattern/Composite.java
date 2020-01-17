package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee {
    private List<Employee> list = new ArrayList<Employee>();
    public void addEmployee(Employee emp){
        list.add(emp);
    }
    public void removeEmployee(Employee emp){
        list.remove(emp);
    }

    @Override
    public void EmployeeDetail() {
        for(Employee emp:list) {
            emp.EmployeeDetail();
        }
    }
}
