package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class minmaxarray {

    public static void main (String args[]){
        //using Integer instead of int (Integer is a wrapper class it allows more functionalities)
        Integer num[] = {85,55,4,8,2,74,95,6,27};
        int min = Collections.min(Arrays.asList(num));
        int max = Collections.max(Arrays.asList(num));

        System.out.println("Minimum num of array is :"+min);
        System.out.println("Maximum num of array is :"+max);
    }


}
