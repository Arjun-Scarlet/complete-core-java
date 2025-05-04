package e_oopsConcepts.Relationship.Aggregation;

public class Users {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Vivo", 8, "Blue");
        m1.insertSim(new Sim("Airtel", 852404492));
        m1.display();

    }
}
