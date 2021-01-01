/**
 * @author : Knight
 * @program : 华为机试
 * @description : 质数因子
 * @date : 2021-01-01 21:49
 **/
//-----------------------------两层循环 + 开方（优化时间）------------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            long num = scanner.nextLong() ;
            for(int i = 2 ; i <= Math.sqrt(num) ; i++){
                while(num % i == 0){
                    num /= i ;
                    System.out.printf("%d ",i) ;
                }
            }
            // 优化时间 并 防止 num 的质数因子为num本身 :
            if(num > 1){
                System.out.printf("%d ",num) ;
            }
        }
        scanner.close() ;
    }
}
//-----------------------------------------------------------------