public class Test14 {
    public static void main(String[] args) {
        Person p = new Person("Saima",2003);
        Student s = new Student("Sima",2001,"CSE");
        Instructor i = new Instructor("Simu",2007,70000);
        System.out.println("Person details is : " + p.toString());
        System.out.println("Student details is : " + s.toString());
        System.out.println("Instructor details is : "+ i.toString());
    }
}
