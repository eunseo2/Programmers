import java.util.HashSet;
import java.util.TreeSet;

public class Set  {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        boolean flag1 = set.add("eunseo");
        System.out.println(flag1);

        
        boolean flag2 = set.add("eunseo");
        System.out.println(flag2);
        
        System.out.println(set.size());

        for(String str: set){
            System.out.println(str+ " ");
        }
        

        //  있는지 확인
        if(set.contains("eunseo")){
            System.out.println("yes");
        }

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(90);
        set2.add(1);
        set2.add(55);

        for(Integer str: set2){
            System.out.println(str+ " ");
        }

        // 정렬된 순서에서 첫번째 객체 반환
        System.out.println("min"+ set2.first());
        System.out.println("max"+ set2.last());

    }
}
