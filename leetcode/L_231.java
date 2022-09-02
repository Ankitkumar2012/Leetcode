package leetcode;

public class L_231 {
	public static void main(String[] args) {
		int n=1;
		System.out.println(ans(n,1));
	}

	private static boolean ans(int n, int a) {
		// TODO Auto-generated method stub
		if(a==n)return true;
		if(a>n)return false;
			
			
		a=a*2;
		return ans(n,a);
	}

}
