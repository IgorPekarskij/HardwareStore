package Solution.Products;

import Solution.Department.AbstractDepartment;
import Solution.Interfaces.DepartmentInterface;
import Solution.Interfaces.ProductInterface;

public abstract class AbstractProduct implements ProductInterface{
    private String company;
    private int price;
    private boolean hasGuarantee;
    private String name;
    private AbstractDepartment department;
    private int quantityOfProduct;

    public AbstractProduct() {
    }

    public AbstractProduct(String company, int price, boolean hasGuarantee, String name, AbstractDepartment department, int quantityOfProduct) {
        this.company = company;
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.department = department;
        this.quantityOfProduct = quantityOfProduct;
    }

    @Override
    public int getPrice() {
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

    @Override
    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    @Override
    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;

    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(AbstractDepartment department) {
        this.department = department;
    }
}
