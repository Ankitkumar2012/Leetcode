package leetcode;

public class L_912 {
	public static void main(String[] args) {
		int [] arr= {1,3,5,2,6,1};
		 int [] brr=ans(arr);
		 for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i]+" ");
		}
	}

	private static int [] ans(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
