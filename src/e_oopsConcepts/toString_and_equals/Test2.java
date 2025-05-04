package e_oopsConcepts.toString_and_equals;

class Student{
    String name;
    int regNo;
    String course;
    public Student(String name, int regNo, String course) {
        this.name = name;
        this.regNo = regNo;
        this.course = course;
    }
    @Override
    public String toString(){
        return "Student Name: "+name+"\nRegister No: "+regNo+"\nCourse: "+course;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("Midoriya", 5, "Java");
        System.out.println(s1);
        System.out.println("-------------");
        Student s2 = new Student("Uraraka", 17, "Java");
        System.out.println(s2);
    }
}
