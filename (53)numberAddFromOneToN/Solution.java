//求1+2+3+...+n
/*
求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、
switch、case等关键字及条件判断语句（A?B:C）。
*/
public class Solution {
	 int sum = 0;  
  
	public boolean add(int n) {  
        sum += n;  
        return (n > 0) && add(n - 1);  
	}  

    public int Sum_Solution(int n) {
    	add(n);
        return sum;
    }

    public static void main(String [] args){
    	Solution s = new Solution();
    	System.out.println(s.Sum_Solution(5));
    }
}
/*
开始的思路通过数组来实现多次调用构造函数来实现,但是在java中
创建数组使用类名作为声明的目的只是为了满足数组的类型明确要求
其实际并没有实际创建对象。
所以想到通过位运算来实现，主要是对于值的边界是否到达的一个判断比较困难，因为没有了
逻辑判断语句，所以需要我们对其通过一个判断函数将值进行累加，同时开始的时候将sum设置为
static类型的时候并出现了error反映出了，其可能是在通过单元测试来对值进行检测，而不是
在通过main函数。
*/