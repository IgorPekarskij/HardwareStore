package Solution.Employees;

import Solution.Products.Product;
import Solution.SalesRoom;

public class Cashier extends Employee{
    private double experience;
    private SalesRoom salesRoom;

    public Cashier(String name, boolean busyness, double experience, SalesRoom salesRoom) {
        super(name, busyness);
        this.experience = experience;
        this.salesRoom = salesRoom;
    }

    public SalesRoom getSalesRoom() {
        return salesRoom;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void getMoney(int cuantity){

    }

    public void giveDicountCard(){

    }

}
