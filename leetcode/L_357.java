package leetcode;

public class L_357 {
	public static void main(String[] args) {
		int n=2;
		System.out.println(ans(n));
	}

	private static int ans(int n) {
		// TODO Auto-generated method stub
		if(n==0){
	         return 1;
	        }
			int sum=10;
			int count=9;
			for(int i=2;i<=n;i++) {
				sum+=count*=(11-i);
			}
			return sum ;
	}

}
