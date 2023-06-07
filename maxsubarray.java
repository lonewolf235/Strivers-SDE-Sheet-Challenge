import java.util.* ;
import java.io.*; 

public class maxsubarray {
	
	public static long maxSubarraySum(int[] arr, int n) {
	long max=0;
	long sum=0;
	for(int i=0;i<n;i++){
		sum+=arr[i];
		if(sum<0)
		sum=0;
		max=Math.max(sum,max);
	}
	return Math.max(sum,max);
	}
	

}
