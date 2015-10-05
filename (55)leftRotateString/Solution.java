//左旋转字符串
/*
汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用
字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K
位后的序列输出。例如，字符序列S=”abcXYZdef”,
要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
*/
public class Solution {
    public static String LeftRotateString(String str,int n) {
    	int length = str.length();
    	String head = "";
    	String tail = "";
    	if(length<n||n<0)
    		return tail+head;
    	for(int i=0; i<length; i++){
    		if(i<n)
    		  head = head+str.charAt(i);
    		else
    			tail = tail+str.charAt(i);
    	}
    	return tail+head;
      
    }
    public static void main(String[]args){
    	String str = "";
    	System.out.println(LeftRotateString(str,10));
    }
}

/*
做了这么久，最简单的一道题目了，没有什么难度可言，可能会有更优的方案存在，后续补充

*/