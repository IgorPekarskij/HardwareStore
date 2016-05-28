package Solution.Employees;

import Solution.Interfaces.DepartmentInterface;
import Solution.Interfaces.EmployeeInterface;

public abstract class BaseEmployee implements EmployeeInterface {
    private String name;
    private boolean free;
    private DepartmentInterface department;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
