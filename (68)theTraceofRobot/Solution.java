public class Solution {
    public static int movingCount(int threshold, int rows, int cols)
    {
        if(threshold<0||rows<=0||cols<=0)
            return 0;
        int [][] array = new int [rows][cols];
        int sum=0;
        searchPath(0,0,array,rows,cols,threshold);
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(array[i][j]==1)
                    sum++;
            }
        }
    	return sum;
    }
    public static void searchPath(int row,int col,int [][]array,int rows,int cols,int threshold){
        if(row<rows&&col<cols&&row>=0&&col>=0){
            if(array[row][col]==0&&(calSum(row)+calSum(col))<=threshold){
                array[row][col]=1;
                searchPath(row-1,col,array,rows,cols,threshold);
                searchPath(row,col-1,array,rows,cols,threshold);
                searchPath(row+1,col,array,rows,cols,threshold);
                searchPath(row,col+1,array,rows,cols,threshold);
            }
        }
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
    	System.out.println(movingCount(10,20,20));
    }
}