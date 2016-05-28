package Solution;

import Solution.Employees.Administrator;
import Solution.Interfaces.CustomerInterface;
import Solution.Interfaces.DepartmentInterface;

import java.util.ArrayList;


public class SalesRoom {
    private String name;
    private ArrayList<CustomerInterface> customerList;
    private ArrayList<DepartmentInterface> departmentList;
    private Administrator administrator;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
