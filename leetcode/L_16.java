package leetcode;

public class L_16 {
	public static void main(String[] args) {
		int arr []= {0,1,2};
		int a=3;
	    System.out.println( ans(arr,a));
		}

	private static int  ans(int[] arr,int a) {
		// TODO Auto-generated method stub
		int ans=Integer.MAX_VALUE;
		int result=0;
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				for (int j2 = j+1; j2 < arr.length; j2++) {
					int add=arr[i]+arr[j]+arr[j2];
					if(add!=a) {
						int sum=Math.abs(a-add);
						if(sum<ans) {
							ans=sum;
							result=add;
						}
						if(arr.length==3&&add==a) {
							result=add;
						}
					}
				}
			}
		}
		return result;
		
	}

}
