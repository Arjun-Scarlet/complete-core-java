package e_oopsConcepts.Inheritance.MethodOverride;

class Phone{
    void call(){
        System.out.println("Call connected");
    }
}
class SmartPhone extends Phone{
    @Override
    void call(){
        System.out.println("HD call connected");
    }
}
public class OverrideExample1 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.call();
    }
}
