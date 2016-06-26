/*
题目描述
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于位于数
组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
*/
public class Solution {

    public static void reOrderArray(int[] array){
        int tmp = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0{
                for(int j=i+1; j<array.length; j++){
                    if(array[j]%2!=0){
                        tmp = array[j];
                        for(int k=j; k>i; k--)
                            array[k] = array[k-1];
                        array[i] = tmp;
                        break;
                    }
                }
            }
        }
        for(int num:array)
            System.out.println(num);
    }

    public void reOrderArray(int[] array) {
        if (array == null || array.length == 0)
            return;
        int positiveNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEvenNumber (array[i])) {
                postiveNum ++;
            }
        }

        for (int j = 0; j < array.length; j++) {
            if (isEvenNumber (array[i])){
                swap(array, i, array.length - (postiveNum--));
            }
        }
    } 

    public boolean isEvenNumber (int num) {
        return (num % 2 == 0);
    }

    public void swap (int[] array, int index1, int index2) {
        array[index1] = array[index1] + array[index2];
        array[index2] = array[index1] - array[index2];
        array[index1] = array[index1] - array[index2];
    }

    public static void main(String [] args){
    	int [] array = {1,2,4,6,7,9};
    	reOrderArray(array);
    }
}
/*
1.寻找偶数，找到后，寻找下一个奇数，找到奇数
2.整体向后移动
*/

/*偶数全部移动到最右侧，奇数移动到左侧，一个笨方法，将奇数拿出来存放到一个数组，然后将偶数拿出来存放到一个数组，然后将两个数组
合并，如果不借助辅助空间，直接在原数组上进行一个操作，我们需要做的是从第一个数开始进行遍历，然后第二重遍历从其后面一位开始，然后
对这些位置进行一个判断，当我们值出现奇数的时候，进行一个交换，然后将其前面的整体后移。保证有序性*/