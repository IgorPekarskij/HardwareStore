package Products;

public class Product {
    private String name;
    private String department;
    private int ram;

    public Product(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Product(String name, String department, int ram) {
        this.name = name;
        this.department = department;
        this.ram = ram;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


    public void turnOn() {

    }

    public void turnOff() {

    }
}
