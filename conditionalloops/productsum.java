package conditionalloops;

import java.util.Scanner;

public class productsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findproductsum(n));
    }

    private static  int findproductsum(int n) {
       int product =1; int sum = 0;
       
        while (n != 0){
            product=product*(n%10);
            sum = sum+(n%10);
            n = n/10;
        }
        return product-sum;
    }
}
