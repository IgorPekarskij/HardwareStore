package Employees;

public class Consultant extends Employee {
    private String department;

    public Consultant(String name, boolean busyness, String department) {
        super(name, busyness);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void helpCustomer(String customer){

    }

    public void transferVisitorToAnotherConsultant(){

    }
}
