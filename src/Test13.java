public class Test13 {
    public static void main(String[] args) {

        Employee e = new Employee("Saima", 70000);
        Manager m = new Manager("Tania", 60000, "CSE");
        Executive e1 = new Executive("Salma", 70000, "Medical");
        System.out.println("Employee" + e.toString());
        System.out.println("Manager" + m.toString());
        System.out.println("Executive" + e1.toString());
    }
}