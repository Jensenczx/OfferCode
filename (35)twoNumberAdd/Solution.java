/*
不用加减乘除做加法
题目描述
写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
*/
public class Solution {
    public static int Add(int num1,int num2) {
        int result;
        do{
        	result = num1^num2;
        	num2 = (num1&num2)<<1;
        	num1 = result;
        }while(num2!=0);
        return result;
    }
    public static void main(String [] args){
    	System.out.println(Add(0,2));
    }
}

/*
之前在lintcode上遇到的问题，但是现在还是思考了很久，完全不记得具体的实现步骤
1.不考虑进位，只考虑当前位的结果，那么我们通过异或即可得到
2.考虑进位问题，通过且运算来获得进位，然后和左移之后，和原来的值相加，直到进位为0
*/