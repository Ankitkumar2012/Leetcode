package leetcode;

public class L_397 {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(ans(n, 0));
	}

	private static int ans(int n, int count) {
		// TODO Auto-generated method stub
		while (n != 1) {
			if (n % 2 == 0)
				n = n / 2;

			else {
				if ((n+1) % 4 == 0) {
					n = n + 1;
				}
				else {
					n = n - 1;
				}
			}
			count++;

		}
		return count;

	}
}
