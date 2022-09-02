package leetcode;

public class L_189_rotatearray {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		int n=2;
		 RotateArray(arr,n);
			 for(int i=0; i<=arr.length; i++) {
				 System.out.print(arr[i]+" ");
			 }
		 }
	public static void RotateArray(int [] arr, int k) {
		int n=arr.length;
		k=k%n;
		for(int j=1; j<=k; j++) {
		int temp=arr[n-1];
		for(int i=n-2; i>=0; i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
		}
		
	}

}
