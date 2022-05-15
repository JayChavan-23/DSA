package Arrays;

public class reversearray {
    
    private static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    private static void printArray(int arr[],int size){
        for(int i = 0 ;i<=size-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8};
        int start = 0;
        int end = arr.length;
        System.out.print("Normal array : ");
        printArray(arr,end);
        reverseArray(arr,start,end-1);
        System.out.print("Reversed array :  ");
        printArray(arr,end);
    }
}
