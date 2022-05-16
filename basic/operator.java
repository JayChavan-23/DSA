package basic;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class operator {
    public static void main(String args[]){
        //take 2 numbers from the user
        System.out.print("Enter first number : ");
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.print("Enter second number : ");
        int num2= sc.nextInt();
        //taking character
        System.out.print("Enter the operator : ");
        char opr = sc.next().charAt(0);
        if(opr=='+'){
            System.out.println("Addition "+(num1+num2));
        }else if(opr=='-'){
            System.out.println("subtraction "+(num1-num2));
        }else if(opr=='/'){
            System.out.println("Division "+(num1/num2));
        }else if(opr=='*'){
            System.out.println("Multiplication "+(num1*num2));
        }
    }
}
