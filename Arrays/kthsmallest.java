package Arrays;
import java.io.*;
import java.util.*;
class kthsmallest {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] a, int l, int r, int k) 
    { 
        int temp;
        //sort the array
        for (int i = 0; i < a.length; i++) {
           for (int j = i + 1; j < a.length; j++) {
              if (a[i] > a[j]) {
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
              }
           }
        }
        //return third smallest element
        return a[2];
    } 
}
