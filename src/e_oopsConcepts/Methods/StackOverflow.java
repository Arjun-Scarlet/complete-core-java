package e_oopsConcepts.Methods;

public class StackOverflow {
    public static void main(String[] args) {
        m1(1);
    }
    public static void m1(int n) {
        if(n>3) return;
        System.out.println(n);
        m1(n+1);
        m1(n--);// Stack Overflow
    }
}
