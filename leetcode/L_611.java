package leetcode;

public class L_611 {
	public static void main(String[] args) {
		int []arr= {2,3,4,4};
		System.out.println(ans(arr));
	}

	private static int ans(int[] arr) {
		// TODO Auto-generated method stub
		int result=0;
		if(arr.length<3) return result;
		for (int i = 2; i < arr.length; i++) {
			int k=0;
			int l=i-1;
			while(k<l) {
				if(arr[k]+arr[l]>arr[i]) {
					result+=l-k;
					l--;
				}
				else
					k++;
			}
		}
		return result;
	}

}
