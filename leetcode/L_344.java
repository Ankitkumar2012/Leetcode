package leetcode;

public class L_344 {
	public static void main(String[] args) {
		char [] s= {'H','a','n','n','a','h'};
		int n=s.length-1;
		char a []=new char[s.length];
//		ans(s,a,n,0);
//		s=a;
//		for(char k:s) {
//			System.out.println(k);
//		}
		ans(s,0,s.length-1);
		for(char k:s) {
			System.out.print(k);
		}
		}
	
      public static void ans(char []s,int i,int j) {     
         if(i>=j) {
	    return;
         }
            swap(s,i,j);
              ans(s, i+1, j-1);
             }
      private static void swap(char[] s, int i, int j) {
               char ch =s[i];
               s[i]=s[j];
               s[j]=ch;
             }
       }
	
	
	
	
	
//	private static void ans(char[] s,char[] a,int n,int i) {
//	// TODO Auto-generated method stub
//	if(n<0&&i==a.length)
//	return;
//	
//	a[i]=s[n];
//	n=n-1;
//	i=i+1;
//	ans(s,a,n,i);
//}
//
//}


