/*
判断一个序列是否属于先序遍历输出
*/
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence,int start, int end) {
    	if(sequence.length==0)
    		return false;
    	int i = start+1;
		for(; i<end; i++) {
			if(sequence[i]>sequence[start])
				break;
		}   
		int j = i;    
		for(; j<end; j++){
			if(sequence[j]<sequence[start])
				return false;
		}
		if(i<end){
			return VerifySquenceOfBST(sequence,start+1,end)&&VerifySquenceOfBST(sequence,i,end);
		}

    }
}
/*
首先根据规律，找到该结点的左子树，然后对剩下的右子树进行一个判断，得到
左右子树的结点后，在进行递归求取左右子树是否符合，关键问题在于递归的时候，对于
边界值的确定。
*/