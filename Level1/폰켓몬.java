import java.util.HashSet;

class 폰켓몬 {
    public int solution(int[] nums) {
        
        int choice = nums.length/2;
        
        HashSet<Integer> setNums = new HashSet<>();
        
        for(int i=0; i< nums.length; i++){
            if(setNums.size() < choice){
                setNums.add(nums[i]);
            }
        }
        return setNums.size();
        
    }
}