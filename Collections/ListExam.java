import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ListExam {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("a");

        System.out.println(list.size());

        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        //정렬
        Collections.sort(list);
        System.out.println("정렬"+ list);

        //역순으로 정렬
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("역순"+list);
    }
    
}


//배열과 리스트는 다른 자료구조이다.
// 배열 -> 한번 생성하면 크기 변경 불가
// 리스트 -> 저장공간이 필요에 따라 자유