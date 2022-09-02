package leetcode;

public class L_633 {
	public static void main(String[] args) {
		int c=8;
		System.out.println(ans(c));
	}

	private static boolean ans(int c) {
		// TODO Auto-generated method stub
		long left = 0, right = (long) Math.sqrt(c);
        while (left <= right) {
            long mid= left * left + right * right;
            if (mid< c) {
                left++;
            } else if (mid> c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
	}

}
