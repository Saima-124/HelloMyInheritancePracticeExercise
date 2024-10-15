public class Instructor extends Person{
    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public String toString(){
        return "Name:" + getName() + ", Year of birth:" + getYearOfBirth() + ", Salary:" + salary;
    }
}
