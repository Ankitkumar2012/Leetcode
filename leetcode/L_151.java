package leetcode;

public class L_151 {
	public static void main(String[] args) {
		String str = "a good   example";
		System.out.println(sol(str, ""));
	}

	private static String sol(String str, String ans) {
		// TODO Auto-generated method stub
		str = reverse(str);
		int start = 0;
		for (int i = 0; i <= str.length(); i++) {
			while (i < str.length() && str.charAt(i) != ' ')
				i++;
			String k = reverse(str.substring(start, i));

			if (i == str.length()) {
				ans += k;

			} else {
				ans += k + " ";

			}
			while (i < str.length() && str.charAt(i) == ' ') {
				i++;
			}
			start = i;
		}
		return ans;

	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		String atr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			atr = atr + str.charAt(i);
		}
		return atr;
	}

}
