package leetcode;

public class L_1071 {
	public static void main(String[] args) {
		String str="1.1.1.1";
		System.out.println(ans(str,""));
	}

	private static String ans(String str,String atr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='.') 
				atr=atr+'['+'.'+']';
			else
				atr=atr+str.charAt(i);
		}
		return atr;
	}

}
