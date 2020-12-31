/**
 * @author : Knight
 * @program : 华为机试
 * @description : 记负均正2
 * @date : 2020-12-31 10:12
 **/
//---------------------------------模拟-------------------------------
import java.util.* ;

public class Main{

    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        int sum = 0 ;
        int cntPositive = 0 ;
        int cntNegative = 0 ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            if(num >= 0){
                sum += num ;
                cntPositive++ ;
            }else{
                cntNegative++ ;
            }
        }
        System.out.println(cntNegative) ;
        System.out.printf("%.1f\n" , sum * 1.0 / cntPositive) ;
        scanner.close() ;
    }
}
//------------------------------------------------------------------------