package leetcode;

public class L_169 {
	public static void main(String[] args) {
		int [] nums= {3,2,3};
		System.out.println(ans(nums));
	}

	private static int ans(int[] arr) {
		// TODO Auto-generated method stub
		int element=0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(count== 0 || element==arr[i]){
                element=arr[i];
                count++;
            }else{
                count--;
            }
		}
		return element;
		
	}

}
