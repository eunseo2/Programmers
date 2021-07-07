import java.util.*;

public class StackExam {
    public static void main(String[] args){
        Stack<String> s1 = new Stack<>();

        s1.push("사과");
        s1.push("바나나");

        // 스택의 최상위 원소를 제거하지 않고 엿보기만 함
        System.out.println(s1.peek());

        System.out.println(s1);

        // 스택의 최상위 원소를 하나씩 뺀다
        System.out.println(s1.pop());

        System.out.println(s1);


        Stack<Integer> s2 = new Stack<>();
        s2.add(10);
        s2.add(20);
        s2.add(1,100); 

        // stack도 벡터처럼 add() 메서드를 사용할 수 있다.

        for(int value : s2)
            System.out.print(value +" ");
        System.out.println();


        //빈 스택이 될때까지 마지막 원소부터 하나씩 반환한다.
        while(!s2.empty())
         System.out.print(s2.pop()+" ");

    }

    
}
