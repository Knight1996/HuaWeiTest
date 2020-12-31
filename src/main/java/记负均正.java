/**
 * @author : Knight
 * @program : 华为机试
 * @description : 记负均正
 * @date : 2020-12-31 10:40
 **/
//-------------------------------------模拟---------------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int cnt = scanner.nextInt() ;
            int sum = 0 ;
            int cntNegative = 0 ;
            int cntPostive = 0 ;
            for(int i = 0 ; i < cnt ; i++){
                int num = scanner.nextInt() ;
                if(num > 0){
                    sum += num ;
                    cntPostive++ ;
                }else if(num < 0){
                    cntNegative++ ;
                }
            }
            System.out.printf("%d %.1f\n" , cntNegative ,sum * 1.0 / cntPostive);
        }
        scanner.close() ;
    }
//-------------------------------------------------------------------------------------
}
