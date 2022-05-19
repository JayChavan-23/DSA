package basic;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
//THE NEXT NUMBER IS THE SUM OF PREVIOUS TWO NUMBER
public class fibonacci {
    public static void main(String args[]){
        System.out.print("Enter the number you want to find the fibonacci");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstnumber = 0;
        int secondnumber = 1;
        int thirdnuumber;
        for(int i = 0;i<=n;i++){
            thirdnuumber=firstnumber+secondnumber;
            System.out.print(" "+firstnumber);
            firstnumber=secondnumber;
            secondnumber=thirdnuumber;
        }
    }
}
