package e_oopsConcepts.Relationship.Composition;

public class Cars {
    String name;
    int carNo;
    String color;
    Engine e;
    public Cars(String n, int num, String c, Engine e){
        name = n;
        carNo = num;
        color = c;
        this.e = e;
    }
    public void display(){
        System.out.println(name);
        System.out.println(e.cc+"cc");
        System.out.println(color+" color");
        System.out.println("Car No."+carNo);
    }
}
