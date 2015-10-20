import java.util.ArrayList;
public class Solution {
    public ArrayList<String> Permutation(String str) {
    	ArrayList<String>result = new ArrayList<String>();
        if(str==null)
       		return result;
       	int len = str.length();
       	if(len==0)
       		return result;
       	char [] words = new char[len];
       	for(int i=0; i<len; i++)
       		words[i]=str.charAt(i);
       	for(int i=0; i<len-1; i++){
       		int min = words[i];
       		int flag = words[i];
       		for(int j=i+1; j<len; j++){
       			if(words[j]<min){
       				min = words[j];
       				flag = j;
       			}
       		}
       		if(flag!=i){
       			words[i] = (char)min;
       			words[flag] = words[i];
       		}
       	}
       	char [][]  matrix = new char[len][len];
       	return result;

    }

    public static void main(String[]args){
    	
    }
}