import java.util.*;
public class 떡볶이떡 {
    public static int binarySearch(int[]arr, int m, int start, int end){
        int answer = 0;

        while(start <= end){
            int sum = 0; 
            int mid = (start+end)/2;
            for(int value : arr){
                if(value >mid) sum += value-mid;
            }
            if(sum >= m ){ 
                start = mid+1;
                answer = mid;
            }

            else end = mid-1;

        }
        return answer;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N 떡의 개수 
        int n = sc.nextInt();
        // M 떡의 길이 
        int m = sc.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);


        System.out.println(binarySearch(arr, m , arr[0],arr[arr.length-1]));


    }
    
}
