package conditionalloops;

import java.util.Scanner;

public class averageofn {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double sum = 0;
    double array[] = new double[n];
    for(int i =0;i<array.length;i++){
        System.out.print("Enter the "+i+" number :");
        array[i] = sc.nextDouble(); 
    }

    for(int i =0;i<array.length;i++){
        sum =sum + array[i];
    }
    double average = sum/n;
    System.out.println(average);
    }
}
