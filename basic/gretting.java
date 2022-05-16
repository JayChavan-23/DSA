package basic;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class gretting {
    public static void main(String args[]){
        //Take the name input with a print statement and store in a variable\
        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        //print the name
        System.out.println("Hello "+name+" Welcome to Java tutorial "+name);
    }
}
