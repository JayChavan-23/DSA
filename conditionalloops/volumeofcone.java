package conditionalloops;

import java.util.Scanner;

public class volumeofcone {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        double vol = Math.PI*(r*r)*(h/3);
        System.out.println(vol);
}
}
