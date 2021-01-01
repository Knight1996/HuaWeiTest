/**
 * @author : Knight
 * @program : 华为机试
 * @description : 走方格的方案数
 * @date : 2021-01-01 19:53
 **/
//--------------------------动态规划---------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int row = scanner.nextInt() + 1 ;
            int col = scanner.nextInt() + 1 ;
            int[][] dp = new int[row][col] ;
            dp[0][0] = 1 ;
            for(int i = 0 ; i < row ; i++){
                dp[i][0] = 1 ;
            }
            for(int i = 0 ; i < col ; i++){
                dp[0][i] = 1 ;
            }
            for(int i = 1 ; i < row ; i++){
                for(int j = 1 ; j < col ; j++){
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1] ;
                }
            }
            System.out.println(dp[row - 1][col - 1]) ;
        }
        scanner.close() ;
    }
}
//-------------------------------------------------------------

//----------------------------递归-----------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int row = scanner.nextInt() ;
            int col = scanner.nextInt() ;
            System.out.println(dfs(row , col)) ;
        }
        scanner.close() ;
    }

    public int dfs(int row , int col){
        if(row == 0 || col == 0){
            return 1 ;
        }
        else{
            return dfs(row - 1 , col) + dfs(row , col - 1) ;
        }
    }
}
//-------------------------------------------------------------