package leetcode;

public class L_1470 {
	public static void main(String[] args) {
		int [] arr= {2,2,6,9,6,6};
		int n=3;
		int brr[]=ans(arr,n);
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i]+" ");
		}
	}

	private static int[] ans(int[] arr, int n) {
		// TODO Auto-generated method stub
		int[] brr=new int[arr.length];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
			k=i;
			}
			else {
				k=n;
			};
		}
		int j=0;
		int l=0;
		while(j<arr.length) {
		brr[j]=arr[l];
		l++;
		j++;
		if(k<arr.length) {
		brr[j]=arr[k];
		j++;
		k++;
		}
		}
		return brr;
		//[7,5,9,7,5,8,10,4,3,3,2,5,9,10] 7  [[2,2,6,9,6,6]
		//[7,4,5,3,9,3,7,2,5,5,8,9,10,10]   [2,9,2,6,6,6]
	}

}
