public class Solution {
    public static int GetUglyNumber_Solution1(int index) {
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

    public static int GetUglyNumber_Solution(int index) {
        if(index<=0)
            return 0;
        int [] result = new int [index];
        result[0]=1;
        int twoIndex = 0;
        int threeIndex = 0;
        int fiveIndex = 0;
        int currentIndex=1;
        while(currentIndex<index){
            int currentNum = min(2*result[twoIndex],3*result[threeIndex],5*result[fiveIndex]);
            result[currentIndex]=currentNum;
            while(2*result[twoIndex]<=currentNum)
                twoIndex++;
            while(3*result[threeIndex]<=currentNum)
                threeIndex++;
            while(5*result[fiveIndex]<=currentNum)
                fiveIndex++;
            currentIndex++;
        }
        return result[index-1];

    }

    public static int min(int num1,int num2,int num3){
        int minNum = (num1<=num2)?num1:num2;
        return (minNum<=num3)?minNum:num3;
    }



    public static void main(String[]args){
    	System.out.println(GetUglyNumber_Solution(100));
    }
}
//非最优解，待优化