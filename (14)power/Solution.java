/*
题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
*/
public class Solution {
    public static double Power(double base, int exponent) {
    	double product = 1;
       	if(exponent==0){
       	  	return product;
       }
       else if(exponent>0){
       		while(exponent>0){
       			product = product*base;
       			exponent--;
       		}
       		return product;
       }
       else if(exponent < 0){
       		while(exponent<0){
       			product = product*base;
       			exponent++;
       		}
       		return (1/product);
       } 
       return product;
  }
  public static void main (String [] args){
  	System.out.println(Power(0,1));
  }
}
/*
考虑到负数问题
*/