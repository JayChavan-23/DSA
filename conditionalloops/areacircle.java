package conditionalloops;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class areacircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        double area = (r*r)*Math.PI;
        System.out.println(area);
    }
}
