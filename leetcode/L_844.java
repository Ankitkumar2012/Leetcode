package leetcode;

public class L_844 {
	public static void main(String[] args) {
		String a="ab#c";
		String b="ad#c";
		System.out.println(bns(a).equals(bns(b)));
	}

	private static String bns(String a) {
		// TODO Auto-generated method stub
		int e=0;
		String ans="";
		for (int i = a.length()-1; i>=0; i--) {
			if(a.charAt(i)=='#') e++;
			else{
			if(e>0)  e--;
			else  ans+=a.charAt(i);
		}
		}
		return ans;
	}

}
