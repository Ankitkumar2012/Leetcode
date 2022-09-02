package leetcode;

public class L_326 {
	public static void main(String[] args) {
		int n=1;
		System.out.println(ans(n,1));
	}

	private static boolean ans(int n,int ans) {
		// TODO Auto-generated method stub
		if(n==1||ans==n)return true;
		if(ans>n)return false;
		
		ans=ans*3;
		return(ans(n,ans));
		
	}

}
