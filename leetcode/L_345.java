package leetcode;

public class L_345 {
	public static void main(String[] args) {
		String str="hello";
		char []ch=str.toCharArray();
		ans(ch);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");			
		}
	}

	private static char[] ans(char [] ch) {
		// TODO Auto-generated method stub
		int i=0;
		int j=ch.length-1;
		while(i<=j) {
			while(i<j  &&  !(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u')) {
				i++;
			}
			while(i<j && !(ch[j]=='a' ||ch[j]=='e' ||ch[j]=='i' ||ch[j]=='o' ||ch[j]=='u')) {
				j--;
			}
			
			char c=ch[i];
			ch[i]=ch[j];
			ch[j]=c;
			
			i++;
			j--;
			}
		return ch;
		}
}
