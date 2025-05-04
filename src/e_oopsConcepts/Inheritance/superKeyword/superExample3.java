package e_oopsConcepts.Inheritance.superKeyword;

class Six{
    Six(int i){
        System.out.println("Six(int) Cons");
    }
}
class Seven extends Six{
    Seven(){
        super(10); //parameterized super()
        System.out.println("Seven() Cons");
    }
}
public class superExample3 {
    public static void main(String[] args) {
        new Seven();
    }
}
