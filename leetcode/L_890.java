package leetcode;

import java.util.ArrayList;

public class L_890 {
	public static void main(String[] args) {
		String []grid= {"abc","deq","mee","aqq","dkd","ccc"};
		String btr="abb";
		ArrayList<String> list=new ArrayList<>();
		for (int i = 0; i < grid.length; i++) {
			if(ans(grid[i],btr)) 
				list.add(grid[i]);
		}
		System.out.println(list);
	}
	private static boolean ans(String atr, String btr) {
		
			for (int j = 0; j < atr.length(); j++) {
				if(atr.indexOf(atr.charAt(j))!=btr.indexOf(btr.charAt(j)))
				return false;
			}
			return true;
	}

}
