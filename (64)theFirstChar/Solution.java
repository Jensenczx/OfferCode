import java.util.ArrayList;
public class Solution {
    //Insert one char from stringstream
    static int [] charIndexTable = new int[95];
    static ArrayList<Character>stack = new ArrayList<Character>();
    public static void Insert(char ch)
    {
      int num = ch-32;
      if(charIndexTable[num]==0){
      	stack.add(ch);
      	charIndexTable[num]++;
      }else{
      	stack.remove(new Character(ch));
      	charIndexTable[num]++;
      }
    }
  //return the first appearence once char in current stringstream
    public static char FirstAppearingOnce()
    {
    	if(stack.size()==0)
    		return '#';
    	else
    		return stack.get(0);
    }

    public static void main(String[]agrs){
    	Insert('g');
    	Insert('o');
    	Insert('g');
    	System.out.println(FirstAppearingOnce());
    }
}