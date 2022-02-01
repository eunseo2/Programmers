import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> setReport = new HashSet<>(Arrays.asList(report));

        Map<String,Integer> result = new LinkedHashMap<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
			result.put(id_list[i], 0);
		}
        
        for(String r : setReport){
            String subR[] = r.split(" ");
            String start = subR[0];
            String target = subR[1];
            if(map.containsKey(target)){
                map.get(target).add(start);
            }else{
                List<String> reporter = new ArrayList<>();
                reporter.add(start);
                map.put(target,reporter);
            }
        }
        
        for(String s : map.keySet()){
            if(map.get(s).size() >= k){
                for (String i : map.get(s)) {
					result.put(i, result.getOrDefault(i, 0) + 1);
				}
            }
        }
        

        return result.values().stream().mapToInt(Integer::intValue).toArray();

    }
}