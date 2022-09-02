package leetcode;

public class L_7 {
	public static void main(String[] args) {
		int c = -1534236469;
		System.out.println(ans(c));
	}

	private static int ans(int c) {
		// TODO Auto-generated method stub
		int k = c;
        if(c<0) c=-1*c;
		long ans = 0;
		while (c != 0) {
			int rem = c % 10;
			ans = ans * 10 + rem;
			c = c / 10;
		}
		 if(ans<=Integer.MIN_VALUE ||ans>=Integer.MAX_VALUE)
	            return 0;
		if (k < 0)
			return (int) (-1 * ans);
		else
			return (int) ans;

	}
}
