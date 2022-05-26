package conditionalloops;

import java.util.Scanner;

public class largestuntil0 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,largest=0,temp;
        while((num=sc.nextInt())!=0){
            if(num>largest){
                largest=num;
            }
        }
        System.out.println(largest);
    }
}
