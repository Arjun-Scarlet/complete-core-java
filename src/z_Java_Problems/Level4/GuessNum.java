package z_Java_Problems.Level4;

import java.util.*;
public class GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int)(Math.random()*9)+1;
        int score = 0;
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name+", You have 3 chances");
        for(int i=1; i<=3; i++){
            System.out.println("Chance "+i+":");
            System.out.print("Enter a number from 1-9: ");
            int n = sc.nextInt();
            if(n==randomNum){
                System.out.println("Awesome!");
                score+=10;
                n = (int)(Math.random()*9)+1;
            }
            else{
                System.out.println("Wrong guess!");
            }
        }
        System.out.println(name+", Your score: "+score);
        sc.close();
    }
}