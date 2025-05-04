package z_Java_Problems.Level2;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int sum = 0;
        for(int n:arr){
            sum+=n;
        }
        System.out.println("Sum of array element => "+sum);
    }
}
