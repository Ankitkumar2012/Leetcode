package leetcode;

public class L_521 {
	public static void main(String[] args) {
		String a="aaaffg";
		String b="aaa";
		System.out.println(ans(a,b));
	}

	private static int ans(String a, String b) {
		// TODO Auto-generated method stub
		 int l=a.length()-1;
			int m=b.length()-1;
			int k=0;
			if(l>m)   k=l;
				else  k=m;
	        if(l!=m) return k+1;
			while(m>=0) {
				if(a.charAt(m)!=b.charAt(m))
					return k+1;
				else m--;
			}
			return -1;
	}

}
