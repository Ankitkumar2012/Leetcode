package leetcode;

public class L_136 {
	public static void main(String[] args) {
		int arr[]= {3,3,2,1,2,2};
		System.out.println(ans(arr));
	}

	private static int ans(int[] arr) {
		// TODO Auto-generated method stub
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==arr[i])
				count++;
			}
			if(count==1) 
				k=arr[i];
		}
		return k;
	}

}
