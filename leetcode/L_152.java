package leetcode;

public class L_152 {
	public static void main(String[] args) {
		int [] arr= {2,3,-2,4};
		ans(arr);
	}

	private static void ans(int[] arr) {
		// TODO Auto-generated method stub
		int msum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum =1;
			for (int j = i; j < arr.length; j++) {

				sum *= arr[j];
                msum = Math.max(msum, sum);
			}		

		}
		System.out.println(msum);
	}

}
