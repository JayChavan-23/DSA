package basic;

import java.util.Scanner;


public class checkpalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        
        if(checkpalindrome(string)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    private static boolean checkpalindrome(String string) {
        int i = 0 ; int j = string.length()-1;
        while(i<j){
            if(string.charAt(i)!=string.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
