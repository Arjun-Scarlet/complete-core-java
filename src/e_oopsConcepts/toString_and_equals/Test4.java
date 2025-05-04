package e_oopsConcepts.toString_and_equals;

class Employee{
    String name;
    int id;
    String role;
    public Employee(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }
    @Override
    public boolean equals(Object o){
        Employee e = (Employee)o;
        return this.name.equals(e.name) && this.id==e.id && this.role.equals(e.role);
    }
}
public class Test4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robby", 101, "Developer");
        Employee e2 = new Employee("Robby", 101, "Developer");
        Employee e3 = new Employee("Miguel", 102, "Developer");
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
    }
}
