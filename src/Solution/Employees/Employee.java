package Solution.Employees;

import Solution.SalesRoom;

public class Employee {
    private String name;
    private boolean busyness;
    private SalesRoom salesRoom;

    public Employee(String name, SalesRoom salesRoom) {
        this.name = name;
        this.salesRoom = salesRoom;
    }

    public Employee(String name, boolean busyness) {
        this.name = name;
        this.busyness = busyness;
    }

    public SalesRoom getSalesRoom() {
        return salesRoom;
    }

    public Employee(String name, boolean busyness, SalesRoom salesRoom) {

        this.name = name;
        this.busyness = busyness;
        this.salesRoom = salesRoom;
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
