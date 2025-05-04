package c_argumentPassing;

public class VarArgs {

	static void m1(int...n){
        int sum = 0;
        for(int num:n){sum+=num;}
        System.out.println("Argument length => "+n.length);
        System.out.println("Sum of Arguments => "+sum);
    }
    public static void main(String[] args) {
        System.out.println("Method call 1:");
        m1(2);
        System.out.println("Method call 2:");
        m1(1,3,5,7);
    }

}
