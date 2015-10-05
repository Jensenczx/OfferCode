//翻转单词顺序列
/*
题目描述
JOBDU最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，
写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish
借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意
识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.
”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
*/
public class Solution {
    public static String ReverseSentence(String str) {
    	String result=null;
        if(str==null)
        	return result;
        String [] array = str.split(" ");
        if(array.length==0)
        	return str;
        for(int i=array.length-1; i>=0; i--){
        	if(result==null)
        		result = array[i];
        	else 
        		result = result+" "+array[i];
        }
      return result;
    }

    public static void main(String[]args){
    	String str = " ";
    	System.out.println(ReverseSentence(str));
    }
}
/*

*/