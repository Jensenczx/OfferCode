/*
题目描述
在一个二维数组中，每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，
输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*/
public class Solution {
    public boolean Find(int [][] array,int target) {
        int flag = 0;
        for(int i=array.length-1; i>=0; i--){
        	for(int j=flag; j<array[i].length; j++){
        		if(target == array[i][j]){
        			return true;
        		}
        		else if(target<array[i][j]){
                    flag = j;
        			break;
        		}
        	}
        }
        return false;
   }

    public boolean Find(int[][] array, int target) {
	int len = array.length;
	int flag = 0;
	for (int i = array.length - 1; i >= 0; i--)
	    for (int j = flag; i < array[i].length; j++){
		if (array[i][j] == target){
		    return true;
		}else if(array[i][j] > target){
		    flag = j;
		    break;
		}
	    }
	}
	return false;     

    }
 
    public static void main(String []args){
    	int array[][]={{1,2,9},{1,3},{2,3}};
    	Solution msolution = new Solution();
    	System.out.println(msolution.Find(array,1));
    }
}

/*
对于这类问题可以采用具体化法，列出一组数据，最后发现右上角的数据最
符合作为判断的依据。同时复习了对于二维数组的一些操作，二维数组通过
length获得是实际含有的数据数目。
*/
