package leetcode;

public class L_162 {
	public static void main(String[] args) {
		int [] arr= {2,4,3,5,6,4,2};
		ans(arr);
	}

	private static void ans(int[] arr) {
		// TODO Auto-generated method stub
		int p=Integer.MIN_VALUE;
		int v=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>p) {
				p=arr[i];
				v=i;
			}
		}
		System.out.println(v);
	}

}
