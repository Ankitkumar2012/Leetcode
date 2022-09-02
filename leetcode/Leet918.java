package leetcode;

public class Leet918 {
	public static void main(String[] args) {
		int [] nums = {1,-2,3,-2};
		System.out.println(ans(nums));
	}
public static int ans(int [] arr) {
	int ans =Integer.MIN_VALUE;
	int sum=0;
	for(int i=0; i<arr.length; i++) {
		sum=sum+=arr[i];
		ans=Math.max(ans, sum);
		if(sum<0) {
			sum=0;
		}
		
	}
	return ans;	
	
}
}
