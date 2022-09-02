package leetcode;

public class L_520 {
	public static void main(String[] args) {
		String str="FFFFFFFFFFFFFFFFFFFFf";
		System.out.println(ans(str));
	}

	private static boolean ans(String str) {
		// TODO Auto-generated method stub
		if(str.length()==1) return true;
		if(str.charAt(0)>='a'&& str.charAt(0)<='z') {
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
				return false;
		   }
		}
		if(str.charAt(0)>='A'&& str.charAt(0)<='Z' && str.charAt(1)>='A'&& str.charAt(1)<='Z') {
			for (int i = 2; i < str.length(); i++) {
				if(str.charAt(i)>='a'&& str.charAt(i)<='z')
					System.out.println(i);
					return false;
			   }
			}
		if(str.charAt(0)>='A'&& str.charAt(0)<='Z' && str.charAt(1)>='a'&& str.charAt(1)<='z') {
			for (int i = 2; i < str.length(); i++) {
				if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
					return false;
			   }
			}
		return true;
	}

}
