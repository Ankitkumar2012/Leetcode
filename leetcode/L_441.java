package leetcode;

public class L_441 {
	public static void main(String[] args) {
		int n=8; 
		System.out.println(ans(n));
	}

	private static int ans(int n) {
		// TODO Auto-generated method stub
		int i=1;
		while(n!=0) {
			n=n-i;
			if(n<0)break;
			i+=1;
		}
		return i-1;
		
	}
}
