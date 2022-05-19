package conditionalloops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        fibobacci(n);
    }

    private static void fibobacci(int n) {
        int first=0 ; int second=1 ; int next;
        for(int i=0;i<=n;i++){
            System.out.print(" "+first);
            next = first+second;
            first=second;
            second=next;
        }
    }
}
