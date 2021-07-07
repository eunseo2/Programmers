import java.util.*;

public class QueueExam {
    public static void main(String[] args){
        Queue<String> q = new LinkedList<String>();

        //q.remove -> 큐에 원소가 없으면 에러가 발생한다. 

        System.out.println(q.poll()); // remove() 메서드와 달리 큐에 원소가 없으면 예외를 발생시키지 않고 null 반환

        q.offer("사과"); //삽입 
        System.out.println("바나나를 추가했나요?"+ q.offer("바나나"));

        try{
            q.add("체리");
        }catch(IllegalStateException e){

        }

        System.out.println("헤드 엿보기: "+ q.peek());


        String head = null;

        head = q.poll();
        System.out.println(head + "제거하기");
        System.out.println("새로운 헤드:"+q.peek());

        System.out.println("체리를 포함하고 있나요?"+ q.contains("체리"));
    }
}
