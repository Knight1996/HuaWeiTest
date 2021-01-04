/**
 * @author : Knight
 * @program : 华为机试
 * @description : Redraiment的走法
 * @date : 2021-01-03 13:49
 **/
//-----------------------------最长上升子序列：动态规划-------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int len = scanner.nextInt() ;
            int[] arr = new int[len] ;
            for(int i = 0 ; i < len ; i++){
                arr[i] = scanner.nextInt() ;
            }
            int[] dp = new int[len] ;
            dp[0] = 1 ;
            int max = 1 ;
            for(int i = 1 ; i < len ; i++){
                dp[i] = 1 ;
                for(int j = 0 ; j < i ; j++){
                    if(arr[i] > arr[j]){
                        dp[i] = Math.max(dp[j] + 1 , dp[i]) ;
                    }
                }
                max = Math.max(max , dp[i]) ;
            }
            System.out.println(max) ;
        }
        scanner.close() ;
    }
}
//----------------------------------------------------------------------------------