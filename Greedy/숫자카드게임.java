import java.util.*;
public class 숫자카드게임 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int result =0; 

        for(int i=0; i<N; i++){

            int min_value = 10001;

            for(int j=0; j<M; j++){
          
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            result = Math.max(min_value, result);

        }

        System.out.println(result);

    }
    
}
