package Solution.Department;

import Solution.Interfaces.DepartmentInterface;
import Solution.Interfaces.EmployeeInterface;
import Solution.Interfaces.ProductInterface;

import java.util.ArrayList;

public abstract class BaseDepartment implements DepartmentInterface{
    private String name;
    private ArrayList<EmployeeInterface> employeeList; // Not implemented
    private ArrayList<ProductInterface> productList; // Not implemented

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    @Override
    public ArrayList<ProductInterface> getProductList() {
        return productList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    public void setProductList(ArrayList<ProductInterface> productList) {
        this.productList = productList;
    }
}
