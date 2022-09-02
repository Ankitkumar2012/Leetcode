package leetcode;

public class L_896 {
	public static void main(String[] args) {
		int arr [] = {-2,-3,-4,-2,-3};
		System.out.println(ans(arr));
	}

	private static boolean ans(int[] arr) {
		// TODO Auto-generated method stub
		int diff=arr[arr.length-1]-arr[0];
		for(int i=1;i<arr.length;i++) {
			if(diff<=0&&arr[i]-arr[i-1]>0) {
				return false;
			}
			if(diff>=0&&arr[i]-arr[i-1]<0) {
				return false;
			}
		}
		return true;
		
	}
}
 