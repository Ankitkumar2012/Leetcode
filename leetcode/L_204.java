package leetcode;

public class L_204 {
	public static void main(String[] args) {
		int a = 0;
		ans(a);
	}
	private static void ans(int a) {
		int count = 0;
        if (a<=1) { System.out.println(count);
        return;}
		boolean[] arr = new boolean[a];
		arr[0] = true;
		arr[1] = true;
		for (int i = 2; i * i < a; i++) {
			if (arr[i] == false) {
				for (int j = 2; j * i < arr.length; j++) {
					arr[j * i] = true;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == false)
				count++;
		}
		System.out.println(count);
	}
}
