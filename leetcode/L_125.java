package leetcode;

public class L_125 {
	public static void main(String[] args) {
		String str="0p";
		System.out.println(ans(str));
	}

	private static boolean ans(String str) {
		// TODO Auto-generated method stub
		String atr="";
		for (int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90)
		    atr=atr+(char) (str.charAt(i)+32);
			else if(ch>=97 && ch<=122)
			atr=atr+str.charAt(i);
			else if(ch>=48 && ch<=57)
				atr=atr+str.charAt(i);
		}
		System.out.println(atr);
		int i=0;
		int j=atr.length()-1;
		while(i<j) {
			if(atr.charAt(i)!=atr.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
