/*
题目描述

我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

*/
public class Solution {

    public int RectCover(int target) {
    	if(target == 1){
    		return 1;
    	}else if(target == 2){
    		return 2;
    	}else if(target > 2){
    		return RectCover(target-1) + RectCover(target-2);
    	}
    	return 0;
    }

    public int RectCover1(int target){
    	int sum1 = 1;
    	int sum2 = 2;
    	int sum = 1;
    	if(target == 1){
    		sum = sum1;
    	}else if(target == 2){
    		sum = sum2;
    	}else{
    		for(int i=3; i<=target; i++){
    			sum = sum1 + sum2;
    			sum1 = sum2;
    			sum2 = sum;
    		}
    	}
    	return sum;
    	
    }


//refine
    public int RectCover2(int target){
	if(target == 1)
	    return 1;
	if(target == 2)
	    return 2;
	if(target > 2)
	    return RectCover2(target - 1) + RectCover(target - 2);
	return 0;
    }

    public int RectCover3(int target){
	int foo1 = 1;
	int foo2 = 2;
	int result = 0;
	if(target == 1)
	    return foo1;
	if(target == 2)
	    return foo2;
	for (int i = 3; i <= target; i++){
	    result = foo1 + foo2;
   	    foo1 = foo2;
  	    foo2 = result;
	}
	return result;
    }

    public static void main(String [] args){
    	Solution s = new Solution();
    	System.out.println(s.RectCover1(5));

    }
}

/*
1.当有零个矩阵的时候，我们有一种方法进行覆盖，那就是用0个矩阵进行覆盖
2.类似于菲波那切数列问题，青蛙跳台阶，矩阵覆盖等，都是每一步增加的和之前走过的
相关联，通过递归就可以解决这个问题。
3.走出第一步，根据第一步的不同方式划分出不同的类型，然后求解。
4.通过递归可以解决的问题，通过循环也是可以解决的。
*/
