package e_oopsConcepts.Binding.LateBinding;

public class CycleTest {
    public static void main(String[] args) {
        CycleDriver c1 = new CycleDriver();
        c1.drive(new Hero());
        System.out.println("----------");
        c1.drive(new Atlas_1());
    }
}
