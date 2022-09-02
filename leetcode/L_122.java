package leetcode;

public class L_122 {
	public static void main(String[] args) {
		int arr []= {7,1,5,3,6,4};
		ans(arr);
	}

	private static void ans(int[] arr) {
		int ans=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]-arr[i-1]>0) {
				ans+=arr[i]-arr[i-1];
			}
		}

		System.out.println(ans);
	}

}
