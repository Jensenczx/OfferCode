public class Solution {
    public static int StrToInt(String str) {
    	int result = 0;
        if(str==null)
        	return 0;
        int length = str.length();
        if(length==0)
        	return 0;
        boolean ifNegative = false;
        if(str.charAt(0)=='-')
        	ifNegative = true;
        for(int i=length-1; i>=0; i--){
        	char subChar = str.charAt(i);
        	if(ifInt(subChar)){
        		if(ifNegative)
        		result -= (subChar-48)*(Math.pow(10,length-1-i));
        		else
        		result += (subChar-48)*(Math.pow(10,length-1-i));
        	}else{
        		if(i==0&&(subChar=='-'||subChar=='+'))
        			return result;
        		else
        			return 0;
        	}
        }
        if(length==1)
        	return result;
        if(result<Math.pow(10,length-1))
        	return 0;
        return result;
    }

    public static boolean ifInt(char subChar){
    	if(subChar>='0'&&subChar<='9')
    		return true;
    	return false;
    }

    public static void main(String[] args){
    	System.out.println(StrToInt(""));
    }
}