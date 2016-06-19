public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
    	if(str==null||pattern==null)
    		return false;
        return match(str,0,pattern,0);
    }

    public boolean match(char[] str,int curS, char[] pattern,int curP){
    	if(curS>=str.length&&curP>=pattern.length)
    		return true;
    	if(curS<str.length&&curP>=pattern.length)
    		return false;
    	if(curP<pattern.length&&curS>=str.length){
    		  if(curP+1==pattern.length-1&&pattern[curP+1]=='*')
    		  	return true;
    		  else return false;
    	}
    	if(curP+1<pattern.length&&pattern[curP+1]=='*'){
			if(str[curS]==pattern[curP]||pattern[curP]=='.')
    			return match(str,curS+1,pattern,curP+2)||match(str,curS+1,pattern,curP)
    				|| match(str,curS,pattern,curP+2);
    		else 
    			return match(str,curS,pattern,curP+2);
    	}else{
    		if(str[curS]==pattern[curP]||pattern[curP]=='.')
    			return match(str,curS+1,pattern,curP+1);
    		else return false;
    	}    	
    }

    public static void main (String[] args){

    }


}