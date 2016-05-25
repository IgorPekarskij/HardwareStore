package Departments;

public class Department {
    private String name;
    private String prodacts;

    public Department(String name, String prodacts) {
        this.name = name;
        this.prodacts = prodacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProdacts() {
        return prodacts;
    }

    public void setProdacts(String prodacts) {
        this.prodacts = prodacts;
    }
}
