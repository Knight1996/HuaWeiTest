/**
 * @author : Knight
 * @program : 华为机试
 * @description : 最长公共子串
 * @date : 2021-01-03 20:40
 **/
//--------------------------动态规划---------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            char[] arr1 = scanner.nextLine().toCharArray() ;
            char[] arr2 = scanner.nextLine().toCharArray() ;

            int len1 = arr1.length ;
            int len2 = arr2.length ;
            int[][] dp= new int[len1  + 1][len2 + 1] ;
            for(int i = 1 ; i <= len1 ; i++){
                for(int j = 1 ; j <= len2 ; j++){
                    if(arr1[i - 1] == arr2[j - 1]){
                        dp[i][j] = dp[i - 1][j - 1]  + 1;
                    }
                    else{
                        dp[i][j] = 0 ;
                    }
                }
            }
            int ans = 0 ;
            for(int i = 0 ; i <= len1 ; i++){
                for(int j = 0 ; j <= len2 ; j++){
                    ans = Math.max(ans , dp[i][j]) ;
                }
            }
            System.out.println(ans) ;
        }
        scanner.close() ;
    }
}
//-------------------------------------------------------------------------