package leetcode;

public class L_744 {
	public static void main(String[] args) {
		char arr[]= {'c','f','j'};
		char ch='z';
		System.out.println(ans(arr,ch));
	}

	private static char ans(char[] arr, char ch) {
		// TODO Auto-generated method stub
        int i = 0;
        int s= 0;
        int e= arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]<=ch){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return arr[s];

	}

}
