package Products;

public class TV extends Product{
    private String model;

    public TV(String name, String department, String model) {
        super(name, department);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public void showChanel(int number) {

    }
}
