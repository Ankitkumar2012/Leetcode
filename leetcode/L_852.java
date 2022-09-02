package leetcode;

public class L_852 {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		System.out.println(ans(arr));
	}

	private static int ans(int[] arr) {
		// TODO Auto-generated method stub
		int c=Integer.MIN_VALUE;
		int d = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>c) {
				c=arr[i];
				d=i;
			}
		}
		return d;
	}

}
