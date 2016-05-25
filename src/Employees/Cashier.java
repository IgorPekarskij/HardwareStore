package Employees;

public class Cashier {
    private String name;
    private double experience;
    private boolean busyness;

    public Cashier(String name, double experience, boolean busyness) {
        this.name = name;
        this.experience = experience;
        this.busyness = busyness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public boolean isBusyness() {
        return busyness;
    }

    public void setBusyness(boolean busyness) {
        this.busyness = busyness;
    }

    public void getMoney(int cuantity){

    }

    public void giveDicountCard(){

    }

}
