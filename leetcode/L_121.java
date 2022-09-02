package leetcode;

public class L_121 {
	public static void main(String[] args) {
		int arr []= {7,6,4,3,1,12};
		ans(arr);
	}

	private static void ans(int[] arr) {
		int ans=0;
		int val=arr[0];
		int min=0;
		for (int i = 0; i < arr.length; i++) {
			val=Math.min(val, arr[i]);
			min=arr[i]-val;
			ans=Math.max(min,ans);
		}
		
		
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				int k=arr[j]-arr[i];
//				if(k>=ans && k>=0)
//					ans=k;
//			}
//		}
		System.out.println(ans);
	}

}
