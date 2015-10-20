public class Solution {

    public static boolean isNumeric(char[] str) {
        int len = str.length;
        if(len==0)
        	return false;
        boolean ifAppearNumber = false;
        boolean ifAppearSign = false;
        boolean ifAppearE = false;
        boolean ifAppearDot = false;
        for(int i=0; i<len; i++){
        	if(str[i]=='+'||str[i]=='-'){
        		if(ifAppearSign||ifAppearNumber)
        			return false;
        		else {
        			ifAppearNumber = false;
        			ifAppearSign  = true;
        	}
        	}
        	else if(str[i]=='.'){
        		if(ifAppearDot||ifAppearE)
        			return false;
        		else {
        			ifAppearDot = true;
        		}
        	}
        	else if(str[i]=='e'||str[i]=='E'){
        		if(ifAppearE||!ifAppearNumber)
        			return false;
        		else{
        			ifAppearE=true;
        			ifAppearNumber=false;
        			ifAppearSign=false;
        		}
        	}
        	else if(str[i]>='0'&&str[i]<='9'){
        		ifAppearNumber = true;
        	}
        	else return false;
        }
        if(!ifAppearNumber)
        	return false;
        return true;

    }

    public static void main(String[]args){
    	char []str ={'-','.','2'};
    	System.out.println(isNumeric(str));
    }

}