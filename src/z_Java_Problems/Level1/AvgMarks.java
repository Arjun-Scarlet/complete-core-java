package z_Java_Problems.Level1;

import java.util.*;
public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject = sc.nextInt();
        double avg = 0;
        for(int i=1; i<=subject; i++){
            int marks = sc.nextInt();
            avg+=marks;
        }
        System.out.println("Average Marks => "+avg/subject);
        sc.close();
    }
}