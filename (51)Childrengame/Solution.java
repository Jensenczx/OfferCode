/*
孩子们的游戏(圆圈中最后剩下的数)
给予两个数字，一个是孩子的数目，另一个数字是当我们进行循环报道，当报到这个数字的人
就要出列，以此循环。
*/
import java.util.ArrayList;
public class Solution {
    public static int LastRemaining_Solution(int n, int m) {
    	ArrayList<Integer>list = new ArrayList<Integer>();
    	if(m==0)
    		return n-1;
        if(n>0&&m>0){
        	for(int i=0; i<n; i++)
        		list.add(i);
        	int index = 0;
        	int num = 1;
        	while(list.size()>1){
        		if(num==m){
        			list.remove(index);
        			num=1;
        		}else{
        			index++;
        			num++;
        		}
        		if(index==list.size())
        			index=0;
        	}
        	return list.get(0);
        }
        return -1;
    }

    public static void main(String[]args){
    	System.out.println(LastRemaining_Solution(5,3));
    }
}
/*
借助于一个数据结构来进行求解，然后通过两个标志位对边界和累计值进行控制
*/