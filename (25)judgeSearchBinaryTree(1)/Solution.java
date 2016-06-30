/*
二叉搜索树的后序遍历序列
题目描述
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
*/
public class Solution {

    public static boolean VerifySquenceOfBST(int [] sequence) {
    	int len = sequence.length;
        if(len==0)
        	return false;
        if(len==1||len==2)
        	return true;
        return ifSquenceOfBST(sequence,sequence.length,0);
    }

    public static boolean ifSquenceOfBST(int [] sequence,int length,int start){
    	int i=start;
    	int root = sequence[length-1];
    	for(; i<length-1; i++){
    		if(sequence[i]>root)
    			break;
    	}
    	for(int j=i+1; j<length-1; j++){
    		if(sequence[j]<root)
    			return false;
    	}
    	boolean left = true;
    	boolean right = true;
    	if(i>0)
    		left = ifSquenceOfBST(sequence,i,0);
    	if(i<length-1)
    		right = ifSquenceOfBST(sequence,length-1,i);
    	return (left&&right);
    }

    public static boolean VerifySquenceOfBST(int [] sequence) {
        
    }
    public static void main(String [] args){
    	int [] sequence = {7,4,6,5};
    	System.out.println(VerifySquenceOfBST(sequence));
    }
}

/*
想到解决方案，但是在编码的的时候仍然感觉比较困难，逻辑的处理上，变量的控制上完全没有头绪，
还是没有养成，在大脑中完全养成一个很好地编码习惯，然后再进行编码的习惯，还是一上来就编码，
然后不停的去改。
*/