package Solution.Products;

public class Product {
    private String name;
    private int ram;

    public Product(String name) {
        this.name = name;

    }

    public Product(String name, int ram) {
        this.name = name;
        this.ram = ram;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
