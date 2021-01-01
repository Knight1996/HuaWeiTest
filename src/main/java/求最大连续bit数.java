/**
 * @author : Knight
 * @program : 华为机试
 * @description : 求最大连续bit数
 * @date : 2021-01-01 19:35
 **/
//---------------------------位运算-----------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            int cnt = 0 ;
            int ans = 0 ;
            while(num != 0){
                if((num & 1) == 1){
                    cnt++ ;
                    ans = Math.max(cnt , ans) ;
                }
                else{
                    cnt = 0 ;
                }
                num >>= 1 ;
            }
            System.out.println(ans) ;
        }
        scanner.close() ;
    }
}
//---------------------------------------------------------------