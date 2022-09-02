package leetcode;

public class L_27 {
	public static void main(String[] args) {
		int [] arr= {0,1,2,2,3,0,4,2};
		int val=2;
		System.out.println(ans(arr,val));
	}

	private static int ans(int[] arr, int val) {
		// TODO Auto-generated method stub
		int count=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=val) {
				arr[count]=arr[i];
				count++;
			}
			
		}
		return count;
		}
	}

