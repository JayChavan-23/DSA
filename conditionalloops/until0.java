package conditionalloops;

import java.util.Scanner;

public class until0 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, sum=0;
        while((num = sc.nextInt()) != 0){
            sum = sum+num;
        }
        System.out.println("Sum is "+sum);
    }
}
