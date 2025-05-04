package e_oopsConcepts.Constructor;

class Rectangle1 {
    int length;
    int breadth;
    static int count;

    Rectangle1(int l, int b){
        length = l;
        breadth = b;
        count++;
    }
    void display(){
        System.out.println("Length: "+length+" and Breadth: "+breadth);
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(10, 20);
        r1.display();
    }
}
