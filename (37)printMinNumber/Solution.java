import java.util.ArrayList;

public class Solution {
    public static String PrintMinNumber(int [] numbers) {
    	//对于零的处理，将其放在第二位上，先不对零进行处理
    	int length = numbers.length;
    	String minNumber = "";
    	if(length==0)
    		return minNumber;
    	ArrayList<Integer> numberList = new ArrayList<Integer>();
    	for(int i=0; i<length; i++){
    		int min = numbers[i];
    		int flag = i;
    		for(int j=i+1; j<length; j++){
    			if(ifLessThan(numbers[j],min)){
    				min = numbers[j];
    				flag = j;
    			}
    		}
    		if(flag!=i){
    			numbers[flag] = numbers[i];
    			numbers[i] = min;
    		}

    	} 
    	for(int j=0; j<length; j++){
    		minNumber = minNumber+""+numbers[j];
    	} 
    	return minNumber;

    }

    public static boolean ifLessThan(int num1, int num2){
    	String str1 = num1+""+num2;
    	String str2 = num2+""+num1;
    	int length = str1.length();
    	for(int i=0; i<length; i++){
    		if(str1.charAt(i)<str2.charAt(i))
    			return true;
    		else if(str1.charAt(i)>str2.charAt(i))
    			return false;
    	}
    	return false;
    }

    public static void main(String[]args){
    	int []number = {};
    	System.out.println(PrintMinNumber(number));
    }
}