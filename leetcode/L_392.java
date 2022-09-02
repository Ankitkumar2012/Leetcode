package leetcode;

public class L_392 {
	public static void main(String[] args) {
		String str = "aaaaaa";
		String atr = "bbaaaa";
		// System.out.println(ans(atr, str, ""));
		System.out.println(ans(str, atr));
	}

	private static boolean ans(String str, String atr) {
		int count = 0,i = 0,j = 0;
		while (i < str.length()) {
			while (j < atr.length() && str.charAt(i) != atr.charAt(j)) {
				j++;
			}
			if (j < atr.length()) {
				count++;
				j++;
			}
			i++;
		}
		if (count == str.length())
		return true;
		return false;

	}
}
