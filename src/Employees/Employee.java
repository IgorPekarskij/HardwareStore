package Employees;

public class Employee {
    private String name;
    private boolean busyness;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, boolean busyness) {
        this.name = name;
        this.busyness = busyness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBusyness() {
        return busyness;
    }

    public void setBusyness(boolean busyness) {
        this.busyness = busyness;
    }
}
