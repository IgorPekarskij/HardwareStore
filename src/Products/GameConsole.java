package Products;

public class GameConsole extends Product {

    public GameConsole(String name, String department, int ram) {
        super (name, department, ram);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
