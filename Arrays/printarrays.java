package Arrays;

public class printarrays {
    public static void main(String args[]){
        String[] names = new String[5];
        names[0]="Jay";
        System.out.println(names[0]);
        int numbers[]={1,5,8,4,6,6};
        System.out.println(numbers[3]);
        //always do n-1
        for(int i = 0 ; i <= numbers.length-1;i++){
            System.out.print(numbers[i]);
        }
    }
}
