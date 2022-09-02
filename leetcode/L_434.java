package leetcode;

public class L_434 {
	public static void main(String[] args) {
		String str="Hello, my name is John";//"Hello, my name is John";//
		System.out.println(ans(str));
	}

	private static int ans(String str) {
		String s=str.trim();
		if(s.length()==0) return 0;
		int count=0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;}
			while(s.charAt(i)==' ')i++;
		      }
		return count+1;
	}

}
