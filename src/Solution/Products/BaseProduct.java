package Solution.Products;

import Solution.Department.BaseDepartment;
import Solution.Interfaces.DepartmentInterface;
import Solution.Interfaces.ProductInterface;

public abstract class BaseProduct implements ProductInterface{
    private String company;
    private double price;
    private boolean hasGuarantee;
    private  String name;
    private BaseDepartment department;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(BaseDepartment department) {
        this.department = department;
    }
}
