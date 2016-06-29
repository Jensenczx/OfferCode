/*
请实现一个函数，将一个字符串中的空格替换成“%20”。例如，
当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
*/
public class Solution {
    public String replaceSpace(StringBuffer str) {
    	char a = ' ';
    	for(int i=0; i<str.length(); i++){
    		if(str.charAt(i)==a){
    			str.replace(i,i+1,"%20");
    		}
    	}
    	return str.toString();
    }

    public String replaceSpace (StringBuffer str) {

    }
    
    public static void main(String []args){
    	StringBuffer str = new StringBuffer("1 fff 234");
        Solution s = new Solution();
    	System.out.println(s.replaceSpace(str));

    }
}
/*
1.得到字符流是确定每一个字符具体内容的基础
2.判断获得的每一个字符流是否符合要求
3.替换
*/