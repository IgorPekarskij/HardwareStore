package Solution.Products;

import Solution.Department.Computers;
import Solution.Department.Department;
import Solution.Department.Games;

public class GameConsole extends Product {
    private Games games;

    public GameConsole(String name, int ram, Games games) {
        super(name, ram);
        this.games = games;
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
