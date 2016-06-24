/*
A代表1，Z代表26，输入一段字符串，判断该值代表多少？
*/

public class Solution {

    public int twentysixRadix(String str) {
    	String capitalStr = str.toUpperCase();
    	int sum = 0;
    	for (int i=0; i<capitalStr.length(); i++){
    		sum = sum + (capitalStr.charAt(i)-64)*(int)(Math.pow(26,capitalStr.length()-i-1)); 
    	}
    	return sum;
    }

    public int twentysixRadix(String str) {
	String capitalStr = str.toUpperCase();
	int len = capitalStr.length();
	int sum = 0;
	for (int i = 0; i < len; i++){
	    sum = sum + (capitalStr.charAt(i)-'A')*(int)(Math.pow(26,len - i - 1));
	}
	return sum;
    }


    public static void main (String [] args){
    	Solution s = new Solution();
    	System.out.println(s.twentysixRadix("ab"));
    }
}
/*
进制转化思想，此时的进制是26进制，考虑到这个问题就ok了，再就是对于每个字母代表值的问题，
充分利用char类型向int的转化。
*/
