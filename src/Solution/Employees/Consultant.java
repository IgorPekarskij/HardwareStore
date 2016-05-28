package Solution.Employees;

import Solution.Department.BaseDepartment;

public class Consultant extends BaseEmployee {
    private BaseDepartment baseDepartment;

    public Consultant(String name, boolean busyness, BaseDepartment baseDepartment) {
        super(name, busyness);
        this.baseDepartment = baseDepartment;
    }

    public BaseDepartment getBaseDepartment() {
        return baseDepartment;
    }

    public void setBaseDepartment(BaseDepartment baseDepartment) {
        this.baseDepartment = baseDepartment;
    }

    public void helpCustomer(){

    }

    public void transferVisitorToAnotherConsultant(){

    }
}
