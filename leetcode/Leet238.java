package leetcode;
import java.util.*;
public class Leet238 {
	public static void main(String[] args) {
		//int [] arr= {1,2,3,4};
		Scanner ak=new Scanner (System.in);
        int n=ak.nextInt();
        int [] arr=new int [n];
        for(int i=0; i<arr.length; i++){
            arr[i]=ak.nextInt();
       }
		int[] ans=mul(arr);
		for(int i=0; i<ans.length; i++) {
		System.out.print(ans[i]+" ");
		}
	}
	public static int[] mul(int [] arr) {
			int a=arr.length;
			int [] left= new int [a];
			left[0]=1;
			for(int i=1; i<a; i++) {
				left[i]=left[i-1]*arr[i-1];
		}
			int [] right= new int [a];
			right[a-1]=1;
			for(int i=a-2; i>=0; i--) {
				right[i]=right[i+1]*arr[i+1];
		}
			for(int i=0; i<arr.length;i++) {
				arr[i]=left[i]*right[i];
			}
			return arr;
			
	}

}
