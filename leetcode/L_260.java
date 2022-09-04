package leetcode;

public class L_260 {
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,2,5};
		int k []=ans(arr);
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i]+" ");
		}
	}

	private static int[] ans(int[] arr) {
		// TODO Auto-generated method stub
		int t=0;
		int k[]=new int[2];
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==arr[i])
				count++;
			}
			if(count==1) { 
			k[t]=arr[i];
			t++;
			}
		}
		return k;
	}

}
