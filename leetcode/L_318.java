package leetcode;

public class L_318 {
	public static void main(String[] args) {
		String arr[]= {"abcw","baz","foo","bar","xtfn","abcdef"};
		System.out.println(ans(arr));
		
	}
	public static int ans(String[] arr) {
		 int ans = 0;
	        for(int i = 0; i < arr.length-1; i++){
	            for(int j = i+1; j < arr.length; j++){
	                if(arr[i].length()*arr[j].length() > ans){
	                    if(checkCommon(arr[i] , arr[j])){
	                        int val = arr[i].length() * arr[j].length();
	                        if(val > ans) ans = val;
	                    }
	                }
	            }
	        }
	        return ans;
	    }
	    public static boolean checkCommon(String s1 , String s2){
	        for(int i = 0; i < s1.length(); i++){
	            String s = "" ;
	            s += s1.charAt(i);
	            if(s2.contains(s)) return false;
	        }
	        return true;
	}

}
