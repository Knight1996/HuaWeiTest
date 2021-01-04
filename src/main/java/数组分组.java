/**
 * @author : Knight
 * @program : 华为机试
 * @description : 数组分组
 * @date : 2021-01-04 13:22
 **/
// -------------------------递归----------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while((scanner.hasNext())){
            int n = scanner.nextInt() ;
            int[] arr = new int[n] ;
            int cnt = 0 ;
            int sum5 = 0 ;
            int sum3 = 0 ;
            for(int i = 0 ; i < n ; i++){
                int num = scanner.nextInt() ;
                arr[i] = num ;
                if(num % 5 == 0){
                    sum5 += num ;
                }
                else if(sum3 % 3 == 0){
                    sum3 += num ;
                }
                else{
                    arr[cnt] = num ;
                    cnt++ ;
                }
            }
            int dis = Math.abs(sum5 - sum3) ;
            System.out.println(helper(0 , cnt , arr , 0 , dis)) ;
        }
        scanner.close() ;
    }

    //int i :剩余数组的起点索引
    //int n  剩余数组的终点索引
    //int[] arr  剩余数组
    //int ans :  剩余数求和的变量
    //int dis :  剩余数求和的目标值
    public boolean helper(int i , int n , int[] arr , int ans , int dis){
        if(i == n){
            return Math.abs(ans) == dis ;
        }
        else{
            return (helper(i + 1 , n , arr , ans + arr[i] , dis) ||
                    helper(i + 1 , n , arr , ans - arr[i] , dis)) ;
        }
    }
}
// -----------------------------------------------------------------------------