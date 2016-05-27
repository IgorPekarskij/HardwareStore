package Employees;

public class Cashier extends Employee{
    private double experience;

    public Cashier(String name, boolean busyness, double experience) {
        super(name, busyness);
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
