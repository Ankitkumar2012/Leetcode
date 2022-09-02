package leetcode;

public class L_58 {
	public static void main(String[] args) {
		String str ="   fly me   to   the moon  ";
//		str="abc";
		ans(str);
	}

	private static int ans(String str) {
		// TODO Auto-generated method stub
		str=str.trim();
		int count=0;
		for(int i=str.length()-1; i>=0; i--) {
		if(str.charAt(i)!=' ') {
			count++;
		}
		else break;
		}
		return count;
	}

}
