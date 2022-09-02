package leetcode;

public class L_35 {
	public static void main(String[] args) {
		int [] arr= {1,3,5,6};
		int t=5;
		ans(arr,t);
	}

	private static void ans(int[] arr, int t) {
		// TODO Auto-generated method stub
		int i=0;
		while(arr[i]<t) {
			i++;
		}
		
		System.out.println(i);
	}

}
