package leetcode;

public class L_551 {
	public static void main(String[] args) {
		String atr="ALL";    //"PPALLP"
		System.out.println(ans(atr));
	}

	private static boolean ans(String atr) {
		// TODO Auto-generated method stub
		int count=0;
		if(atr.charAt(0)=='A')  count++;
        int count2=0;
		for (int i = 0; i < atr.length(); i++) {
			if(atr.charAt(i)=='A' && i!=0) {
				count++;
				if(count==2) return false;
			}			
			if(atr.charAt(i)=='L') {
			count2++;
			System.out.println(count2);
			if(count2==3) return false;
			}
			if(atr.charAt(i)!='L')
				count2=0;
		}
		return true;
	}

}
