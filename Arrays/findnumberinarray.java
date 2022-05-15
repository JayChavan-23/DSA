package Arrays;

import java.util.Scanner;

public class findnumberinarray {
    public static void main(String args[]){
        int numbers[] = {5,7,9,23,4,55};
        System.out.print("Enter the number you want to find :");
        Scanner sc = new Scanner (System.in);
        int x  = sc.nextInt();
        for(int i = 0 ; i <= numbers.length-1;i++){
            if(numbers[i]==x){
                System.out.println("Index of your number is "+i);
            }
        }
    }
}
