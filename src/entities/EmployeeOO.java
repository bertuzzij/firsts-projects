package entities;

public class EmployeeOO {

    private int id;
    private String name;
    private double salary;


    public EmployeeOO(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double newSalary(double percentage){
        return this.salary += ((salary * percentage) / 100);

    }

    public String toString(){
        return id
                +", "
                +name
                +", "
                +salary;
    }

}
