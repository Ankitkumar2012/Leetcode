package leetcode;

public class L_747 {
	public static void main(String[] args) {
		int []arr= {3,6,1,0};
		System.out.println(ans(arr));
	}

	private static int ans(int[] arr) {
		// TODO Auto-generated method stub
		int k=Integer.MIN_VALUE;
		int l=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>k) {
				k=arr[i];
			    l=i;
			}
		}
		System.out.println(l);
		System.out.println(k);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]*2>k && i!=l)
				return -1;
		}
		return l;
	}

}
