/*
第一个只出现一次的字符位置
题目描述
在一个字符串(1<=字符串长度<=10000，全部由字母组成)
中找到第一个只出现一次的字符的位置。若为空串，返回-1。位置索引从0开始
*/
public class Solution {
    public static int FirstNotRepeatingChar(String str) {
    	int len = str.length();
    	if(str==null)
    		return -1;
    	if(len==0)
    		return -1;
    	int lowCaseArray [] = new int [26];
    	int uperCaseArray [] = new int [26];
    	for(int i=0; i<len; i++){
    		if(str.charAt(i)<97){
    			lowCaseArray[str.charAt(i)-65]=lowCaseArray[str.charAt(i)-65]+1;
    		}else{
    			uperCaseArray[str.charAt(i)-97]=uperCaseArray[str.charAt(i)-97]+1;
    		}
    	}
    	for(int j=0; j<len; j++){
    		if(str.charAt(j)<97){
    			if(lowCaseArray[str.charAt(j)-65]==1)
    				return j;
    		}else{
    			if(uperCaseArray[str.charAt(j)-97]==1)
    				return j;
    		}
    	}
        return -1;
    }

    public static void main(String [] args){
    	String str = "abCcsdabAD";
    	System.out.println(FirstNotRepeatingChar(str));
    }
}
/*
对所有的字母建立一个哈希表，然后第一次遍历的时候，将所有数据填入哈希表，第二步要做的是将
所有的数据再次进行遍历，同时寻找此时哈希表中，出现次数为1的数字。
*/