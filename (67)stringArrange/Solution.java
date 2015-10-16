import java.util.ArrayList;
public class Solution {
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> result = new ArrayList<String>();
       if(str==null)
       		return result;
       result.add(str);
       for(int i=0; i<str.length(); i++){
       	String temStr = new String(str);
       		for(int j=i+1; j<str.length();j++){
       			if(str.charAt(j)!=str.charAt(i)){
       				temStr.
       			}

       		}
       }
    }
}