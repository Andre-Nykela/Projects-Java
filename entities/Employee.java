package entities;

public class Employee {
    private String name;
    private Integer id;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, Integer id, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Double getSalary() {

        return salary;
    }

    public void setSalary(Double salary) {

        this.salary = salary;
    }

    public double increaseSalary(double percent) {

        return salary += salary * percent / 100.00;
    }

    @Override
    public String toString() {

        return id
                + ", "
                + name
                + ", "
                + String.format("%.2f", salary);
    }
}
