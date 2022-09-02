package leetcode;

import java.util.ArrayList;

public class L_350 {
	public static void main(String[] args) {
		int arr[]= {4,9,5};
		int brr[]= {9,4,9,8,4};
		ArrayList<Integer> list=new ArrayList<>();
		int arrr[]=ans(arr,brr,list);
		for (int i = 0; i < arrr.length; i++) {
			System.out.print(arrr[i]+" ");
		}
	}

	private static int[] ans(int[] arr, int[] brr,ArrayList<Integer> list) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < brr.length; j++) {
				if(arr[i]==brr[j]) {
				list.add(arr[i]);
				brr[j]=-1;
				break;
				}
			}
		}
		int [] arrr=new int[list.size()];
		int m=0;
		for(int K:list) {
			arrr[m]=K;
			m++;
		}
		return arrr;
	}

}
