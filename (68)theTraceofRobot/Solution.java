public class Solution {
    public static int movingCount(int threshold, int rows, int cols)
    {
    	if(rows<=0||cols<=0||threshold<0)
    		return 0;
    	if(threshold==0)
    		return 1;
    	int [][] map = new int[cols][rows];
    	int num=0;
        for(int i=0; i<cols; i++){
        	for(int j=0; j<rows; j++){
        		map[i][j]= calSum(i)+calSum(j);
        		if(map[i][j]<=threshold)
        			num++;
        		else
        			break;
        	}
        }
        return num;
    }
    public static int calSum(int num){
    	int sum = 0;
    	while(num>0){
    		sum += num%10;
    		num = num/10;
    	}
    	return sum;
    }

    public static void main(String[]args){
    	System.out.println(movingCount(15,15,20));
    }
}