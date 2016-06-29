/*
题目描述

输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
，例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
*/
import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
    	if(matrix[0].length==0)
    		return null;
    	ArrayList list = new ArrayList();
    	int start = 0;
    	int rowEnd = matrix.length-1;
    	int colEnd = matrix[start].length-1;
    	int flag = 0;
    	while(rowEnd-start>=0&&colEnd-start>=0){
    		for(int i=start; i<=colEnd; i++){
    			list.add(matrix[start][i]);
    		}

    		for(int j=start+1; j<=rowEnd; j++){
    			 list.add(matrix[j][colEnd]);
    		}
    			
    		for(int k=colEnd-1; k>=start; k--){
    			if((rowEnd-start)>0)
    			list.add(matrix[rowEnd][k]);
    		}

    		for(int x=rowEnd-1; x>start; x--){
    			if((colEnd-start)>0)
    			list.add(matrix[x][start]);
    		 }
    		rowEnd--;
    		colEnd--;
    		start++;
    	}
    	return list;
    }


    public static void main(String [] args){
    	int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    	int [][] matrix3 ={{1},{2},{3},{4}};
    	int [][] matrix1 = {{1}};
    	int [][] matrix2 = {{}};
    	int [][] matrix4 = {{1,2,3,4,5}};
    	System.out.println(printMatrix(matrix1));
    }
}
/*
遍历方法通过设置哨兵位来确保边界，情况较多，较复杂，一些情况很难考虑到，以后写代码要首先想打一些测试数据
然后在写程序的时候就会有针对性，然后确定结构，再填充内容。
*/