package leetcode;

import java.util.Scanner;

public class L_59 {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int arr[][]=new int[n][n];
		int minr=0;
		int maxr=arr.length-1;
		int minc=0;
		int maxc=arr.length-1;
		int a=1;
		while(a<=n*n) {
			for(int i=minc; i<=maxc &&  a<=n*n; i++) {
                arr[minr][i]=a;
				a++;
			}
			minr++;
			for(int i=minr; i<=maxr && a<=n*n; i++) {
                arr[i][maxc]=a;
				a++;
			}
			maxc--;
			for(int i=maxc; i>=minc && a<=n*n; i--) {
                 arr[maxr][i]=a;
				a++;
			}
			maxr--;
			for(int i=maxr; i>=minr && a<=n*n; i--) {
                 arr[i][minc]=a;
				a++;
			}
			minc++;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
