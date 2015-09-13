public class Solution {
    public static void reOrderArray(int [] array) {
    	int tem=0;
        for(int i=0; i<array.length; i++){
        	if(array[i]%2==0){
        		for(int j=i+1; j<array.length; j++){
        			if(array[j]%2!=0){
        				tem = array[j];
        				for(int k=j; k>i; k--){
        					array[k]=array[k-1];
        				}
        				array[i]=tem;
        				break;
        			}
        		}
        	}
        }
        for(int num:array){
        	  System.out.println(num);
        }
    }
    public static void main(String [] args){
    	int [] array = {1,2,4,6,7,9};
    	reOrderArray(array);
    }
}