import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	ArrayList<Integer> temList = new ArrayList<Integer>();
        int length = num.length;
        if(length<size||length==0||size<=0)
        	return result;
        int maxNum = num[0];
        int index = 0;

        for(int i=0; i<size; i++){
        	temList.add(num[i]);
        	if(maxNum<=num[i]){
        		maxNum = num[i];
        		index = i;
        	}
        }
        result.add(maxNum);
        for(int j=size; j<length; j++){
        	temList.remove(0);
        	temList.add(num[j]);
        	result.add(maxNum(temList,size));
        }
        return result;
    }

    public static int maxNum(ArrayList<Integer>list,int size){
    	int tem = list.get(0);
    	for(int i=1; i<size; i++){
    		if(tem<list.get(i))
    			tem = list.get(i);
    	}
    	return tem;
    }


    public static void main(String[]args){
    	int [] array = {1,3,5,7,9,11,13,15};
    	System.out.println(maxInWindows(array,4));
    }
}

/*

给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么
一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对
数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， 
{2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， 
{2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
*/