package leetcode;

public class L_33 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,3,5,7};
		int t=3;
		System.out.println(ans(arr,t));
	}

	private static int ans(int[] arr, int t) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==t)
				return i;
		}
		return -1;
	}

}
