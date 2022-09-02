package leetcode;

public class L_19 {
	public static void main(String[] args) {
		int x=-121;
		ans(x);
	}

	private static boolean ans(int x) {
		// TODO Auto-generated method stub
		String ch=x+"";
		int i=0, j=ch.length()-1;
		while(i<j) {
			if(ch.charAt(i)==ch.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}

}
