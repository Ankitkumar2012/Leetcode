package leetcode;

public class L_485 {
	public static void main(String[] args) {
		int arr[]= {1,1,0,1,1,1};
		System.out.println(ans(arr));
	}
	private static int ans(int[] nums) {
		  int max=0;
	        for(int i=0;i<nums.length;i++){
	           int  count=0;
	            while(i<nums.length && nums[i]==1){
	                count ++;
	                i++;
	            }
	            if(count>max){
	                max=count;
	            }
	        }
	        return max;
		
	}

}
