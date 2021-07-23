import java.util.*;

public class Array {

    public static void main(String[] args){
        int [] arr = new int[1001];

        //arr 배열 모든 값을 100으로 초기화 함. 
        Arrays.fill(arr,100);

        System.out.println(arr[0]);

        arr[1000] = 1; 
        
        Arrays.sort(arr);

        System.out.println(arr[0]);

    }
}