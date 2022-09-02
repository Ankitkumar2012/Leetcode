package leetcode;

public class L_592 {
	public static void main(String[] args) {
		int n=4;
		System.out.println(ans(n));
	}

	private static int ans(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1)
			return n;
		
		int f1=ans(n-1);
		int f2=ans(n-2);
		return f1+f2;
	}

}
