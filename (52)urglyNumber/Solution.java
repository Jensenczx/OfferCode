public class Solution {
    public static int GetUglyNumber_Solution(int index) {
    	if(index<=0)
    		return 0;
    	if(index==1)
    		return 1;
    	int num=1;
    	int flag=2;
    	while(num!=index){
    		if(ifUglyNumber(flag)){
    				num++;
    		}
    		flag++;
    	}
        return --flag;
    }

    public static boolean ifUglyNumber(int number){
    	while(number%2==0)
    		number = number/2;
    	while(number%3==0)
    		number = number/3;
    	while(number%5==0)
    		number = number/5;
    	return (number==1)? true:false;
    }

    public static void main(String[]args){
    	System.out.println(GetUglyNumber_Solution(7));
    }
}
//非最优解，待优化