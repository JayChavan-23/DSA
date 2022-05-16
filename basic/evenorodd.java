package basic;
//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class evenorodd {
    public static void main(String args[]){
                //write a print statement to take the input 
                System.out.print("Enter the number you want to check : ");
    //scanner class take the input from the user
                Scanner sc = new Scanner(System.in);
    //store the value into the variable
                int x = sc.nextInt();
    //check with the help of a condition and then print accordingly
                if(x%2==0){
                    System.out.println("The number is a even number");

                }else{
                    System.out.println("The number is a odd number");
                }
}
    } 

