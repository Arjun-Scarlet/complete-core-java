package e_oopsConcepts.Object.ObjAsParameter;

class Bike{
    String color;
    Bike(String color){
        this.color = color;
    }
    void display(){
        System.out.println("Bike color: "+color);
    }
}
class Garage{
    void changeColor(Bike b){
        b.color = "Blue";
        System.out.println("Color changed into "+b.color);
    }
}
public class ObjectAsArgs1 {
    public static void main(String[] args) {
        Bike b1 = new Bike("Yellow");
        b1.display();

        Garage g1 = new Garage();
        g1.changeColor(b1);
    }
}
