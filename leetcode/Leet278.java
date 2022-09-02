package leetcode;

public class Leet278 {
	public static void main(String[] args) {
		int n=5;
		int k=4;
		
	}
	public static boolean isBadVersion(int version) {
		return false;
	}
	public static int firstBadVersion(int n, int k) {
		int lo=1;
		int hi=n;
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isBadVersion(mid)==true) {
				ans=mid;
				hi=mid-1;
			}else {
				lo=mid+1;
			}
		}
		return ans;
		
	}

}
