public class Employee {
    private static int idSchetchik = 0;
    private int id;
    private String name;
    private String surName;
    private String lastName;
    private int otdel;
    private int salary;

    public int getId() {
        return id;
    }

    public Employee(String name, String surName, String lastName, int otdel, int salary) {
        this.id = idSchetchik++;
        this.name = name;
        this.surName = surName;
        this.lastName = lastName;
        this.otdel = otdel;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getOtdel() {
        return otdel;
    }

    public int getSalary() {
        return salary;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", otdel=" + otdel +
                ", salary=" + salary +
                '}';
    }
}
