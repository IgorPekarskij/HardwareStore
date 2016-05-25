package Employees;

public class Consultant {
    private String name;
    private String department;
    private boolean busyness;

    public Consultant(String name, String department, boolean busyness) {
        this.name = name;
        this.department = department;
        this.busyness = busyness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isBusyness() {
        return busyness;
    }

    public void setBusyness(boolean busyness) {
        this.busyness = busyness;
    }

    public void helpCustomer(String customer){

    }

    public void transferVisitorToAnotherConsultant(){

    }
}
