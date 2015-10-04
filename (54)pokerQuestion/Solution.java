/*
扑克牌顺子
LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,
2个小王(一副牌原本是54张^_^)...他随机从中抽出了5张牌,想测测
自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,
嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子
.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,并且A
看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(
大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。
 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何。
 为了方便起见,你可以认为大小王是0。
*/
public class Solution {
    public static boolean isContinuous(int [] numbers) {
    	int length = numbers.length;
    	int zeroNum = 0;
    	int gapSum = 0;
    	if(length!=5)
    		return false;
    	for(int i=0; i<length; i++){
    		int tem = numbers[i];
    		int flag = i;
    		for(int j=i+1; j<length; j++){
    			if(numbers[j]<tem){
    				tem = numbers[j];
    				flag = j;
    			}
    		}
    		if(flag!=i){
    			numbers[flag]=numbers[i];
    			numbers[i]=tem;
    		}
    	}
    	for(int i=0; i<length-1; i++){
    		if(numbers[i]==0)
    			zeroNum++;
    		else if(numbers[i+1]-numbers[i]==0)
    			return false;
    		else gapSum += numbers[i+1]-numbers[i]; 
    	}
    	if((gapSum-(length-zeroNum-1)-zeroNum)<=0)
    		return true;
    	return false;
    }
    	 public static void main (String[]args){
    	 	int [] numbers = {4,0,0,0,0};
    	 	System.out.println(isContinuous(numbers));
    }

    }
/*
开始完全没有思路，参考剑指offer一书，找到了相应的解决方案，发现了一个问题，当前
解决问题的能力真的是很差，感觉需要用题海战术把题量提升上去，然后再针对具体的点深入下去看，
基础薄弱，题量又不够。
本题的解法通过排序，将我们抽出牌的顺序整理好，然后根据计算连续数的差值和0的个数来计算我们
的数组是否符合要求。
*/