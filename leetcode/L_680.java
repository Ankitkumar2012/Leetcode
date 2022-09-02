package leetcode;

public class L_680 {
	public static void main(String[] args) {
		String atr="ebc";
		System.out.println(ans(atr));
	}
	private static boolean ans(String atr) {
		int a=0;
		int b=atr.length()-1;
		while(a<b) {
			if(atr.charAt(a)!=atr.charAt(b)) {
				return pall(atr,a+1,b)||pall(atr,a,b-1);
			}
			a++;
			b--;
		}
		return true;
	}
	private static boolean pall(String atr, int i, int j) {
		// TODO Auto-generated method stub
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

//int a=0;
//int b=atr.length()-1;
//int count=0;
//while(a<=b) {
//	if(atr.charAt(a)!=atr.charAt(b)) {
//		count++;
//		if(atr.charAt(a)==atr.charAt(b-1))
//			b--;
//		else a++;				
//		if(count==2) return false;
//	}
//	else {
//	a++;
//	b--;
//	}
//}
//return true;
