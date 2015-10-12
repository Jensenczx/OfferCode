import java.util.ArrayList;
public class Solution {

	static ArrayList<Integer>result=new ArrayList<Integer>();
	static Boolean ifOdd=false;

    public static void Insert(Integer num) {
    	int length = result.size();
    	int low=0;
    	int high=length-1;
    	if(length>=1){
    		int min = result.get(low);
    		int max = result.get(high);
    		if(num<=min)
    			result.add(0,num);
    		else if(num>max)
    			result.add(num);
    		else{
    			while((high-low)>1){
    				int middle = low+(high-low)/2;
    				int tem = result.get(middle);
    				if(num>tem)
    					low=middle;
    				else if(num<tem)
    					high=middle;
    				else if(num==tem){
    					result.add(middle,num);
    					break;
    				}
    			}
    			result.add(low+1,num);
    		}
    	}
    	else
    		result.add(num);
    	if(ifOdd)
    		ifOdd=false;
    	else 
    		ifOdd=true;
    }

    public static Double GetMedian() {
    	int length = result.size();
    	if(length==0)
    		return 0.0;
    	if(ifOdd)
    		return result.get(length/2).doubleValue();
    	else 
    		return (result.get(length/2).doubleValue()+result.get(length/2-1).doubleValue())/2;
    }

    public static void main(String[]args){
    	Insert(5);
    	Insert(2);
    	Insert(3);
    	Insert(4);
    	System.out.println(GetMedian());
    }


}