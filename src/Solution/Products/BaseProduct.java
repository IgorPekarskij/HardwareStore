package Solution.Products;

public class BaseProduct {
    private String name;
    private int ram;

    public BaseProduct(String name) {
        this.name = name;

    }

    public BaseProduct(String name, int ram) {
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
