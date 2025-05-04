package c_argumentPassing;

public class AdditionVarArgs {
    public static void add(int...n) {
        int sum = 0;
        for(int num:n){
            sum+=num;
        }
        System.out.println("Sum of Args => "+sum);
    }
    public static void main(String[] args) {
        add(5);
        add(1,5);
        add(1,3,5,7,9);
    }
}
