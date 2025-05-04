package e_oopsConcepts.Relationship.Aggregation;

public class Sim {
    String name;
    long simNo;
    public Sim(String n, long num){
        name = n;
        simNo = num;
    }
    public void display(){
        System.out.println(name+" sim");
        System.out.println("Phn No: "+simNo);
    }
}
