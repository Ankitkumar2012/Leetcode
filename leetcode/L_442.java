package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_442 {
	public static void main(String[] args) {
		int arr []= {4,3,2,7,8,2,3,1};
		System.out.println(ans(arr));
	}

	
	private static List<Integer> ans(int[] arr) {
		// TODO Auto-generated method stub
		List<Integer> answer=new ArrayList<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]==arr[i+1]) {
					answer.add(arr[i]);
				
			}
		}
		return answer;
		
	}

}
