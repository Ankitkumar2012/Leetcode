package leetcode;

public class L_34 {
	public static void main(String[] args) {
		int [] nums = {5,7,7,8,8,10};
		int n=8;
		ans(nums,n);
	}

	private static void ans(int[] nums, int target) {
		// TODO Auto-generated method stub
		int a=0; 
		int b=nums.length-1;
		while(a<b) {
			if(nums[a]!=target) a++;
			if(nums[b]!=target) b--;
			if(nums[a]==target&&nums[b]==target) {
				System.out.println(a+" "+b);
				break;
			}
		}
	}
 
}
