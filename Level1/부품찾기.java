  
import java.util.*;
public class 부품찾기 {
    public static String binarySearch(int[]arr, int target, int start, int end){
        while (start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target) return "yes";
            else if(arr[mid] > target) end = mid-1;
            else start =mid+1;
        }
        return "no";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N(가게의 부품 개수)
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        // M(손님이 확인 요청한 부품 개수)
        int m = sc.nextInt();
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        List<String> answers = new ArrayList<>();

        for(int target : targets){
            answers.add( binarySearch(arr,target,0, arr.length-1));
        }

        System.out.println(answers);
       
    }

}

