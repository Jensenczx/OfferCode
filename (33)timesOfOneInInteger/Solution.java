/*
整数中1出现的次数（从1到n整数中1出现的次数）
题目描述
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出
现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更
加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
*/
public class Solution {
    public static int NumberOf1Between1AndN_Solution(int n) {
    	int sum=0;
    	if(n<1)
    		return 0;
    	int tem=1;
    	for(int i=1; i<=n; i++){
    		tem = i;
    		while(tem>0){
    			if(tem%10==1){
    				sum++;
    			}
    			tem=tem/10;
    		}
    	}
    	return sum;
    }

    public static void main(String[] args){
    	System.out.println(NumberOf1Between1AndN_Solution());
    }
}
/*
和之前的求解数组中三的个数的问题类似，应该在时间效率上还是能够提高的，当然这个方法或许是最差的
后面将会再继续更新。
*/