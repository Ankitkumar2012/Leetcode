package leetcode;
public class L_941 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(ans(arr));
	}

	private static boolean ans(int[] arr) {
		// TODO Auto-generated method stub
		int d=min(arr);
		if(arr.length<3 || d==arr.length-1) 
		{
			return false;
		}
		for(int i=1; i<=d; i++) {
			if(arr[i]<arr[i-1])
				return false;
		}
		for(int j=arr.length-1; j>d; j--) {
			if(arr[j]>=arr[j-1]) {
            return false;			}
		}
		return true;
	}

	private static int min(int[] arr) {
		// TODO Auto-generated method stub
		int c=Integer.MIN_VALUE;
		int d = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>c) {
				c=arr[i];
				d=i;
			}
		}
		return d;	
	}

}
