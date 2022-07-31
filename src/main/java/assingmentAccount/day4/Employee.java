package assingmentAccount.day4;

public class Employee {

    private int personalId;
    private String name;
    private int salary;
    private int nr;
    private String title;

    public Employee(int personalId, String name, int salary, int nr, String title) {
        this.personalId = personalId;
        this.name = name;
        this.salary = salary;
        this.nr = nr;
        this.title = title;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return title;
    }

    public void setJob(String job) {
        this.title = title;
    }

    public int getAge() {
        return salary;
    }

    public void setAge(int salary) {
        this.salary = salary;
    }
}
