public class Solution {
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
    	if(matrix.length==0&&str.length==0)
    		return true;
    	if(matrix.length==0||rows<=0||cols<=0)
    		return false;
    	int [][] flagArray = new int [rows][cols];
    	char [][] charMatrix = new char[rows][cols];
    	for(int i=0; i<rows; i++){
    		for(int j=0; j<cols; j++){
    			charMatrix[i][j]=matrix[i*cols+j];
    		}
    	}
        for(int i=0; i<matrix.length; i++){
            if(matrix[i]==str[0]){
                if(searchPath(i/cols,i%cols,rows,cols,charMatrix,0,str.length,str,flagArray))
                    return true;
            }
        }
        return false;
    }
//利用回溯法，分出每一个步骤，观察标志位的值是否是需要进行清理操作的。
    public static boolean searchPath(int row,int col,int rows,int cols,char [][]charMatrix,int num,int len,char []sample,int[][] flag){
        if(num==len)
            return true;
		if(row>=0&&col>=0&&row<rows&&col<cols&&num<len&&flag[row][col]==0){
            boolean statusFlag = false;
            if(charMatrix[row][col]==sample[num]){
                flag[row][col]=1;
                num++;
                if(searchPath(row-1,col,rows,cols,charMatrix,num,len,sample,flag))
                    statusFlag=true;
                else if(searchPath(row+1,col,rows,cols,charMatrix,num,len,sample,flag))
                    statusFlag=true;
                else if(searchPath(row,col-1,rows,cols,charMatrix,num,len,sample,flag))
                    statusFlag=true;
                else if(searchPath(row,col+1,rows,cols,charMatrix,num,len,sample,flag))
                    statusFlag=true;
            }
            flag[row][col]=0;
            return statusFlag;
        }
        return false;
    }

    public static void main(String[]args){
        char[] matrix = {'a', 's', 'c','e', 's' ,'f', 'c', 's', 'a', 'd', 'e' ,'e'};
        char[] str = {'a','s','a'};
        System.out.println(hasPath(matrix,3,4,str));
    }


}