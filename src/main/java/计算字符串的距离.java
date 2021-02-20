/**
 * @author : Knight
 * @program : 华为机试
 * @description : 	计算字符串的距离
 * @date : 2021-02-13 20:32
 **/
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            char[] arr1 = s1.toCharArray() ;
            char[] arr2 = s2.toCharArray() ;
            System.out.println(helper(arr1 , arr2));
        }
        scanner.close();
    }

    public int helper(char[] arr1 , char[] arr2){
        int len1 = arr1.length ;
        int len2 = arr2.length ;
        int[][] dp = new int[len1 + 1][len2 + 1] ;
        for(int i = 0 ; i <= len1 ; i++){
            dp[i][0] = i ;
        }
        for(int i = 1 ; i <= len2 ; i++){
            dp[0][i] = i ;
        }
        for(int i = 1 ; i <= len1 ; i++){
            for(int j = 1 ; j <= len2 ; j++){
                if (arr1[i - 1] == arr2[j - 1]){
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else{
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1 ;
                }
            }
        }
        return dp[len1][len2] ;
    }
}