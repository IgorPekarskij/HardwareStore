package Solution;

import Solution.Customers.BaseCustomer;
import Solution.Department.BaseDepartment;
import Solution.Employees.Administrator;

import java.util.ArrayList;


public class SalesRoom {
    private String name;
    private ArrayList<BaseCustomer> baseCustomer;
    private ArrayList<BaseDepartment> baseDepartment;
    private Administrator administrator;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
