/*
栈的压入、弹出序列
题目描述
输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
*/

import java.util.ArrayList;

public class Solution {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
    	int len = popA.length;
    	int len1 = pushA.length;
    	if(len!= len1||len==0||len1==0)
    		return false;
    	ArrayList <Integer>list = new ArrayList <Integer>();
    	for(int i: pushA)
    		list.add(i);
    	for(int k: popA){
    		if(list.indexOf(k)==-1)
    			return false;
    	}
    	if(len<=2)
    		return true;
    	for(int j=1; j<len-1; j++){
    		if((list.indexOf(popA[j])<list.indexOf(popA[j-1]))
    			&&((list.indexOf(popA[j])<list.indexOf(popA[j+1]))))
    			return false;
    	}
    	return true;
    }

    public static void main(String [] args){
    	int [] push ={};
    	int [] popA ={};
    	System.out.println(IsPopOrder(push,popA));
    }
}

/*
再次意识到的一个问题那就是鲁棒性，无论任何时候，在写代码的时候，都应该要考虑到
各种情况，然后对各种情况进行一个判断，对每种情况都能够做出很好地反映，之后再有针对性的
进行编程。
再就是对于问题的分析能力，从实际问题中抽象出来一个模型，然后对模型进行编程。

*/