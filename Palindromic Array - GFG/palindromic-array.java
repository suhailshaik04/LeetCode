//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n){
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        int num=0;
	        int orgi=a[i];
	        while(a[i]!=0){
	            int dig=a[i]%10;
	            num = num*10+dig;
	            a[i]=a[i]/10;
	        }
	        if(num==orgi) arr[i]=1;
	    }
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==0){
	            return 0;
	        }
	    }
	    return 1;
	}
}