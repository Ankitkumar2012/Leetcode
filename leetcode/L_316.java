package leetcode;

public class L_316 {
	public static void main(String[] args) {
		String str = "bcabc";
		System.out.println(ans(str));
	}

	private static String ans(String str) {
		// TODO Auto-generated method stub
		String atr = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}

			}
			if (count == 0) {
				atr = atr + str.charAt(i);
			}
		}
		return atr; 
	}

}
