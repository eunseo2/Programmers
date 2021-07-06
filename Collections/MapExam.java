import java.util.*;
import java.util.Set;

public class MapExam {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("001","kim");
        map.put("002","lee");
        map.put("003","choi"); 

        map.put("001","kang"); // 키는 중복될 수 없다. 

        System.out.println(map.size());


        System.out.println(map.get("001")); //kang 이 출력됨. 중복된 키가 들어온다면 마지막에 들어온 값을 저장시킴

        Set<String> keys = map.keySet(); 

        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()){
            String key = iter.next();
            String value = map.get(key);

            System.out.println(key+":"+value);
        }
    }

}



