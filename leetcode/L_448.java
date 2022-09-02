package leetcode;

import java.util.ArrayList;

public class L_448 {
	public static void main(String[] args) {
		int [] arr= {1,2,2,2,2,2,2,2};
		ArrayList<Integer> list=new ArrayList<>();
		ans(arr,list);System.out.println(list);
	}

	private static ArrayList<Integer> ans(int[] nums, ArrayList<Integer> list) {
        
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            
            if(nums[val-1] == val) continue;
            
            int temp = nums[val-1];
            nums[val-1] = val;
            nums[i] = temp;
            
            if(val != i+1) i--;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                list.add(i+1);
            }
        }
        
        return list;
	}

}
