package leetcode;

public class L_167 {
	public static void main(String[] args) {
		int arr[] = {3,24,50,79,88,150,345};
		int target=200;
		int []brr=ans(arr,target);
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i]+" ");
		}
	}

	private static int [] ans(int[] arr, int target) {
		// TODO Auto-generated method stub
		int [] brr=new int[2];
		int a=0;
		int b=arr.length-1;
		while(arr[a]+arr[b]!=target) {
			if(arr[a]+arr[b]<target)
				a++;
			else 
				b--;
		}
		brr[0]=a+1;
		brr[1]=b+1;
		return brr;
		
		
		
		
//		for (int i=0; i<arr.length-1 && arr[i]<=target; i++) {
//			for (int j=i+1; j<arr.length && arr[i]<=target; j++) {
//				if(arr[i]+arr[j]==target) {
//					brr[0]=i+1;
//					brr[1]=j+1;
//				}
//			}
//		}
//		return brr;
	}

}
