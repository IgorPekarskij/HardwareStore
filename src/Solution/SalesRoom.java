package Solution;

import Solution.Bank.Bank;
import Solution.Consultant;
import Solution.Customers.Customer;
import Solution.Department.Department;
import Solution.Employees.Cashier;
import Solution.Employees.Employee;


public class SalesRoom {
    private String name;
    private Consultant consultante;
    private Customer customer;
    private Bank bank;
    private Department department;

    public SalesRoom(String name, Consultant consultante, Customer customer, Bank bank, Department department) {
        this.name = name;
        this.consultante = consultante;
        this.customer = customer;
        this.bank = bank;
        this.department = department;
    }

    public SalesRoom(String name, Consultant consultante, Customer customer, Department department) {
        this.name = name;
        this.consultante = consultante;
        this.customer = customer;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
