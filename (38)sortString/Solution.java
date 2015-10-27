import java.util.ArrayList;
public class Solution {

      static ArrayList<String>result = new ArrayList<String>();

    public static ArrayList<String> Permutation(String str) {
      if(str==null)
        return result;
      if(str.length()==0)
        return result;
      char []charArray = new char[str.length()];
      for(int i=0; i<str.length(); i++)
        charArray[i]=str.charAt(i);
      for(int i=0; i<charArray.length;i++){
        char tmp = charArray[i];
      }
      permutation(charArray,0,charArray.length-1);
      System.out.println(result);
      for(int i=0; i<result.size()-1; i++){
        String min = result.get(i);
        int flag = i;
        for(int j=i+1; j<result.size(); j++){
          if(min.compareTo(result.get(j))>0){
              min = result.get(j);
              flag = j;
          }
        }
        if(flag!=i){
            result.set(flag,result.get(i));
            result.set(i,min);
          }
      }
      return result;
    }

    public static void permutation(char[]array,int start, int end){
      if(start==end){
        String tmpStr = new String(array);
        result.add(tmpStr);
      }
      for(int i=start; i<=end; i++){
          if(i!=start&&array[i]==array[start])
            continue;
          swap(array,i,start);
          permutation(array,start+1,end);
          swap(array,i,start);
      }

    }

    public static void swap(char[]str,int i,int start){
      char tmp = str[i];
      str[i] = str[start];
      str[start] = tmp;
    }

    public static void main(String[]args){
      String str = "aabc";
      System.out.println(Permutation(str));
      System.out.println("caab".compareTo("caba"));
    }
}