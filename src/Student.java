public class Student extends Person{
    public String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
    @Override
    public String toString(){
        return "Name:" + getName() + ", Year of birth:" + getYearOfBirth() + ", Major:" + major;
    }
}
