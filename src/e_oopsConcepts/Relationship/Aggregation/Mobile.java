package e_oopsConcepts.Relationship.Aggregation;

public class Mobile {
    String name;
    int ram;
    String color;
    Sim s;
    public Mobile(String n, int ram, String c){
        name = n;
        this.ram = ram;
        color = c;
    }
    public void insertSim(Sim s){
        this.s = s;
    }
    public void display(){
        if(s!=null)
        s.display();
        else System.out.println("Sim not Ejected!");
        System.out.println("Mobile: "+name);
        System.out.println(ram+"GB RAM");
        System.out.println("Color: "+color);
    }
}
