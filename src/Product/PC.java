package Product;

public class PC {
    private String name;
    private int amountOfRAM;
    private String department;

    public PC(String name, int amountOfRAM, String department) {
        this.name = name;
        this.amountOfRAM = amountOfRAM;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfRAM() {
        return amountOfRAM;
    }

    public void setAmountOfRAM(int amountOfRAM) {
        this.amountOfRAM = amountOfRAM;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void turnOnPC(){

    }

    public void turnOfPC(){

    }

    public void loadOperationSystem(String operationSystem) {

    }
}
