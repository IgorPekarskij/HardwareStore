package Solution.Employees;

import Solution.Department.Department;

public class Consultant extends Employee {
    private Department department;

    public Consultant(String name, boolean busyness, Department department) {
        super(name, busyness);
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void helpCustomer(String customer){

    }

    public void transferVisitorToAnotherConsultant(){

    }
}
