package case_study.models;

public class Employee extends Person{
    private String level;
    private String position;
    private String department;
    private String salary;

    public Employee() {
    }

    public Employee(String level, String position, String department, String salary) {
        this.level = level;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String level, String position, String department, String salary) {
        super(name, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
