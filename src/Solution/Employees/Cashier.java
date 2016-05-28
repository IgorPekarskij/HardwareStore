package Solution.Employees;

import Solution.SalesRoom;

public class Cashier extends BaseEmployee {
    private double experience;


    public Cashier(String name, double experience) {
        super(name);
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
