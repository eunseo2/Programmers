import java.util.Scanner;

public class 일이될때까지 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;

        while(n>1){
            if(n%k == 0){
                count +=1;
                n /= k;
            }else{
                n -=1;
                count +=1;
            }
        }

        System.out.println(count);
        
    }
    
}
 