import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class 큰수의법칙 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //배열 내림차순 정렬
        Arrays.sort(arr,Collections.reverseOrder());

        int sum = 0;


        while(M>0){
            for(int i=1; i<=K; i++ ){
                if(M>0){
                sum += arr[0];
                M -=1;
                }
            }
            if(M>0){
                sum += arr[1];
                M -=1;
            }
        }

        System.out.println(sum);
    }
    
}
