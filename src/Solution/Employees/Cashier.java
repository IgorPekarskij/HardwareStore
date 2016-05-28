package Solution.Employees;

import Solution.Products.Product;
import Solution.SalesRoom;

public class Cashier extends Employee{
    private double experience;


    public Cashier(String name, boolean busyness, double experience, SalesRoom salesRoom) {
        super(name, busyness, salesRoom);
        this.experience = experience;

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
