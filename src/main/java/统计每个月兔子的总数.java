/**
 * @author : Knight
 * @program : 华为机试
 * @description : 统计每个月兔子的总数
 * @date : 2021-01-01 16:38
 **/
//------------------------动态规划----------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int month = scanner.nextInt() ;
            int[] dp = new int[month + 1] ;
            dp[1] = 1 ;
            dp[2] = 1 ;
            for(int i = 3 ; i <= month ; i++){
                dp[i] = dp[i - 2] + dp[i - 1] ;
            }

            System.out.println(dp[month]) ;
        }
        scanner.close();
    }
}
//------------------------------------------------------------

//-----------------------动态规划:空间优化----------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int month = scanner.nextInt() ;
            int a = 1 , b = 1 , c = 0;
            for(int i = 3 ; i <= month ; i++){
                c = a + b ;
                a = b ;
                b = c ;
            }
            System.out.println(c) ;
        }
    }
}
//------------------------------------------------------------