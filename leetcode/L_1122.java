package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class L_1122 {
	public static void main(String[] args) {
		int arr[]= {2,3,1,3,2,4,6,7,9,2,19};
		int brr[]= {2,1,4,3,9,6};
		ans(arr,brr);
	}

	private static void ans(int[] arr, int[] brr) {
		Arrays.sort(arr);
		int ans[]=new int[arr.length];
		int k=0;
		 for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(brr[i]==arr[j]) {
					ans[k]=arr[j];
					k++;
					arr[j]=-1;
				}
			}
		}		 
		 for (int i = 0; i < arr.length; i++) {
			 if(arr[i]!=-1) {
				ans[k]=arr[i];
				k++;
			 }
		}
		 for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
