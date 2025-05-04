package e_oopsConcepts.thisKeyword;

class Box {
    int length;
    int breadth;
    Box(){
        
    }
    Box(int l, int b){
        length = l;
        breadth = b;
    }
    Box(int n){
        this(n, n);
    }
    void display(){
        System.out.println("Length: "+length+"\nBreadth: "+breadth);
        System.out.println("------------");
    }
}
public class thisExample4 {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20);
        b1.display();

        Box b2 = new Box(30);
        b2.display();
    }
}
