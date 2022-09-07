package leetcode;

public class L_263 {
	public static void main(String[] args) {
		int n=14;
		System.out.println(ans(n));
	}

	private static boolean ans(int n) {
		if(n<=0)return false;
        if(n==2||n==1)return true;
        int i=2;
		while(i <= n) {
			if(n%i==0) {
				if(!(i%2==0 || i%3==0 ||i%5==0)) {
					return false;
				}
            n=n/i;
            }
				else {
					i++;
				}
			
			if(i>=7) return false;
		}
		return true;
	}

}
