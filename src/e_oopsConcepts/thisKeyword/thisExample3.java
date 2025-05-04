package e_oopsConcepts.thisKeyword;

class D {
    int i;
    int j;
    D(int n){
        i = n;
    }
    D(int x, int y){
        this(x);
        j = y;
        // new D(30); -->returns 0 because of new object creation
    }
}
public class thisExample3 {
    public static void main(String[] args) {
        D d1 = new D(10,20);
        System.out.println(d1.i+" and "+d1.j);
    }
}
