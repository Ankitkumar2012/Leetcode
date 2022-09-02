package leetcode;

public class L_67 {
	public static void main(String[] args) {
		String a="11";
		String b="11";
		ans(a,b);	
	}

	private static void ans(String a, String b) {
		// TODO Auto-generated method stub
		int i=a.length()-1;
		int j=b.length()-1;
		StringBuilder sb = new StringBuilder();
		int sum=0;
		while(i>=0||j>=0) {
			if(i>=0) {
				sum+=a.charAt(i)-'0';
			}
			if(j>=0) {
				sum+=b.charAt(j)-'0';
			}
			int k=sum%2;
			sb.append(k);
			sum=sum/2;
			i--;j--;
		}
		if(sum!=0) {
			sb.append(sum);
		}
		System.out.println(sb.reverse().toString());
	}

}
