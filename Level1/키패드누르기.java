import java.util.*;

public class 키패드누르기 {
    static HashSet<Integer> l = new HashSet<Integer>(Arrays.asList(1,4,7));
    static HashSet<Integer> r = new HashSet<Integer>(Arrays.asList(3,6,9));
    static String handL = "*";
    static String handR = "#";
    static String answer = "";
    static String keyBoard[][] = {{"1","2","3"},{"4","5","6"},{"7","8","9"},{"*","0","#"}};
    public String solution(int[] numbers, String hand) {
      for(int num : numbers){
        String strNum = Integer.toString(num);
        if(l.contains(num)){
          answer+= "L";
          handL = strNum;
        }else if(r.contains(num)){
          answer+= "R";
          handR = strNum;
        }else{
          find(handL, handR, strNum, hand);
        }
      }
  
      return answer;
    }
  
    public void find(String left, String right, String num, String hand){
      int[] l = findKeyBoard(left);
      int[] r = findKeyBoard(right);
      int[] n = findKeyBoard(num);
  
      int distanceL = Math.abs(l[0]-n[0]) + Math.abs(l[1]-n[1]);
      int distanceR = Math.abs(r[0]-n[0]) + Math.abs(r[1]-n[1]);
  
      if(distanceL > distanceR){
        answer += "R";
        handR = num;
      }else if(distanceR > distanceL){
        answer+= "L";
        handL = num;
      }else{
        if(hand.equals("left")){
          answer += "L";
          handL = num;
        }else{
          answer += "R";
          handR = num;
        }
      }
  
    }
  
    public int[] findKeyBoard(String str){
      for(int i=0; i<keyBoard.length; i++){
        for(int j=0; j<keyBoard[i].length; j++){
          if(keyBoard[i][j].equals(str)){
            return new int[] {i,j};
          }
        }
      }
      return null;
    }
}  