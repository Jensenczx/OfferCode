/*
和为S的连续正数序列
小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,
他马上就写出了正确答案是100。但是他并不满足于此,他在想究
竟有多少种连续的正数序列的和为100(至少包括两个数)。没多
久,他就得到另一组连续正数和为100的序列:18,19,20,21,22
。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck! 
输出描述:
输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
*/
import java.util.ArrayList;
public class Solution {
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer>>  result   = new ArrayList<ArrayList<Integer>>();
     	if(sum<=0)
     		return result;
     	int head = 1;
     	int tail = sum/2+1;
     	int accum = 0;
     	while(head!=tail){
     		accum=(head+tail)*(tail-head+1)/2;
     		if(accum==sum){
     			ArrayList<Integer> temList = new ArrayList<Integer>();
     			for(int i=head; i<=tail; i++)
     				temList.add(i);
     			result.add(temList);
     			head++;
     			tail++;
     		}else if(accum>sum)
     			tail--;
     		else{
     			head++;
     			tail++;
     		}
     		if(tail>(sum/2+1))
     			break;
     		}
     		return result;
     	}  

    public static void main(String[] args){
    	System.out.println(FindContinuousSequence(1));
    }
}

/*
和前一个题目计算数组中的两个数字的和等于一个给定的数的时候类似，都是通过两个标志位
一个表示第一个数据，一个表示最后一个数据来进行计算，然后通过对于值的判断来控制两个标志
位的移动，对于这个题目开始的时候陷入了一个思维误区就是想着如何寻找数字的规律，然后从
对所给的数字进行除法运算从而获得最后，而现在的思路是设置标志位，通过对标志位当前指向数据的
计算来进一步确定其下一步的走向。
*/