package e_oopsConcepts.Inheritance.superKeyword;

class Four{
    Four(){
        System.out.println("Four() Cons");
    }
}
class Five extends Four{
    Five(int n){
        System.out.println("Five(int) Cons");
    }
    Five(){
        this(10); //this() and super() cannot be used at the same time
        System.out.println("Five() Cons");
    }
}
public class superExample2 {
    public static void main(String[] args) {
        new Five(); //Five()-->Five(int)-->Four()-->Object()
        System.out.println("------------");
        new Five(20); //Five(int)-->Four()-->Object()
    }
}
